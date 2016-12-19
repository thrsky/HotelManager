package com.hotel.action.hotel;

import com.hotel.bean.Hotel;
import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UpdateHotelAction extends ActionSupport{
	
	private Hotel hotel;
	private HotelService hotelService;
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public HotelService getHotelService() {
		return hotelService;
	}

	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	@Override
	public String execute() throws Exception {
		this.hotelService.updateHotel(hotel);

		return SUCCESS;
	}


}
