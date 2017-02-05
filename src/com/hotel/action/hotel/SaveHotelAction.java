package com.hotel.action.hotel;

import com.hotel.bean.Hotel;
import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;

public class SaveHotelAction extends ActionSupport{
	private Hotel hotel;
	public HotelService hotelService;
	public Hotel getHotel(){return hotel;}
	public void setHotel(Hotel hotel){
		this.hotel=hotel;
	}
	public HotelService getHotelService(){
		return hotelService;
	}
	public void setHotelService(HotelService hotelService){
		this.hotelService=hotelService;
	}
	
	public String execute() throws Exception{
		try {
			this.hotelService.addHotel(hotel);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	
	

}
