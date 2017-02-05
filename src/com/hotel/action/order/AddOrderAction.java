package com.hotel.action.order;
import java.util.Map;

import com.hotel.bean.Hotel;
import com.hotel.bean.Order;
import com.hotel.bean.Room;
import com.hotel.service.HotelService;
import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
public class AddOrderAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean roomSta;
	private Order order;
	private Room room;
	private Hotel hotel;
	private long roomId;
	private long userId;
	private OrderService orderService;
	private RoomService roomService;
	private HotelService hotelService;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	
	
	public Hotel getHotel(long roomId){
		String hql="from Room room where room.roomId=?";
		long hotelId=this.roomService.findRoomById(roomId).getHotel().getHotelId();
		return this.hotelService.findHotelById(hotelId);
		
	}
	
	public String execute() throws Exception{
		roomSta=this.roomService.RoomIsFree(roomId);
		String hql="from Room room where room.roomId=?";
		long hotelId=this.roomService.findRoomById(roomId).getHotel().getHotelId();
		Hotel hotel=this.hotelService.findHotelById(hotelId);
		
		if(roomSta){
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("hotel", hotel);
		}else{
			return "roomIsUsed";
		}
		
		return SUCCESS;
	}
	
}
