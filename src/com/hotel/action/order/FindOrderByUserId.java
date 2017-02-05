package com.hotel.action.order;
import java.util.List;
import java.util.Map;

import com.hotel.bean.Order;
import com.hotel.service.OrderService;
import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class FindOrderByUserId extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	private Order order;
	private String status;
	public HotelService getHotelService() {
		return hotelService;
	}
	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	private OrderService orderService;
	private HotelService hotelService;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String execute() throws Exception{
		
		try {
			List<Order> orderlist = this.orderService.findOrderByUserName(userName);
			Map request = (Map)ActionContext.getContext().get("request");
			request.put("ordersByUserName", orderlist);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	
	
	
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
}
