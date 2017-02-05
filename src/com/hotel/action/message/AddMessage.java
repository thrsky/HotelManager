package com.hotel.action.message;

import com.hotel.service.MessageService;
import com.hotel.service.OrderService;
import com.opensymphony.xwork2.ActionSupport;

public class AddMessage extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;
	private long orderId;
	private String messageValue;
	private MessageService messageService;
	private OrderService orderService;
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
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public String execute() throws Exception{
		try {
			long hotelId=this.getOrderService().findOrderById(orderId).getHotelId();
			long user=this.orderService.findOrderById(orderId).getUser().getUserId();
			System.out.println("userId is "+userId+","+user);
			this.messageService.addMessage(user, hotelId, messageValue);
			//this.messageService.addMessage(userId, hotelId, messageValue);
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
