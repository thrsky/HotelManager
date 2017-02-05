package com.hotel.action.order;

import java.sql.Timestamp;
import java.util.Map;

import com.hotel.bean.Message;
import com.hotel.bean.Order;
import com.hotel.service.MessageService;
import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FinishOrder extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;
	private long orderId;
	private long roomId;
	private String messageValue;
	private OrderService orderService;
	private MessageService messageService;
	private UserService userService;
	private RoomService roomService;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getMessageValue() {
		return messageValue;
	}
	public void setMessageValue(String messageValue) {
		this.messageValue = messageValue;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public String execute() throws Exception{
		
		try {
			Order order = this.orderService.findOrderById(orderId);
			order.setOrderStatus("已完成");
			this.orderService.updateOrder(order);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("order", order);
			Timestamp d = new Timestamp(System.currentTimeMillis()); 
			request.put("time", d);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
