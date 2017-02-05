package com.hotel.action.hotel;

import java.util.Map;

import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindHotelById extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long hotelId;
	private HotelService hotelService;
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public HotelService getHotelService() {
		return hotelService;
	}
	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	
	public String execute() throws Exception{
		try {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("hotelList", this.hotelService.findHotelById(hotelId));
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	
	public String findAllHotel() throws Exception{
		try {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("allhotel", this.hotelService.findAllHotel());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
}
