package com.hotel.action.order;

import com.hotel.bean.Order;
import com.hotel.bean.User;
import com.hotel.service.OrderService;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class AcceptOrder extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userusedIntegration;
	private long orderId;
	private long workerId;
	private OrderService orderService;
	private UserService userService;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getWorkerId() {
		return workerId;
	}

	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public String agree() throws Exception {

		try {
			Order order = this.orderService.findOrderById(orderId);
			order.setOrderStatus("进行中");
			this.orderService.updateOrder(order);
			return SUCCESS;
		} catch (Exception e) {
			return INPUT;
		}

	}

	public String notagree() throws Exception {

		try {
			Order order = this.orderService.findOrderById(orderId);
			order.setOrderStatus("未通过");
			this.orderService.updateOrder(order);
			//给用户退订金和积分
			User user=this.userService.findUserById(order.getUser().getUserId());
			user.setUserIntegration(user.getUserIntegration()+userusedIntegration);
			this.userService.updateUser(user);
			return SUCCESS;
		} catch (Exception e) {
			return INPUT;
		}

	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public int getUserusedIntegration() {
		return userusedIntegration;
	}

	public void setUserusedIntegration(int userusedIntegration) {
		this.userusedIntegration = userusedIntegration;
	}
}
