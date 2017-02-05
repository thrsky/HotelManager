package com.hotel.action.hotel;

import java.sql.Timestamp;
import java.util.Map;

import com.hotel.service.HotelService;
import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HotelPageAndRoom extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Timestamp orderInDate;
	private Timestamp orderOutDate;
	private Long hotelId;
	private RoomService roomService;
	private HotelService hotelService;
	
	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	public HotelService getHotelService() {
		return hotelService;
	}

	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	
	public String execute() throws Exception{
		try {
			System.out.println(orderOutDate);
			Map request = (Map)ActionContext.getContext().get("request");
			request.put("roomlist", this.roomService.findFreeRoomByHotelIdAndTime(hotelId,orderInDate,orderOutDate));
			request.put("hotelInfo", this.hotelService.findHotelById(hotelId));
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

	public Timestamp getOrderOutDate() {
		return orderOutDate;
	}

	public void setOrderOutDate(Timestamp orderOutDate) {
		this.orderOutDate = orderOutDate;
	}

	public Timestamp getOrderInDate() {
		return orderInDate;
	}

	public void setOrderInDate(Timestamp orderInDate) {
		this.orderInDate = orderInDate;
	}
	
	
}
