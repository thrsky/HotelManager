package com.hotel.action.hotel;

import com.hotel.bean.Hotel;
import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeHotelStatus extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long hotelId;
	private HotelService hotelService;

	public HotelService getHotelService() {
		return hotelService;
	}

	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	
	public String execute() throws Exception{
		try {
			Hotel hotel= this.hotelService.findHotelById(hotelId);
			if(hotel.getHotelStatus().equals("营业")){
				hotel.setHotelStatus("歇业");
				
			}else{
				hotel.setHotelStatus("营业");
			}
			
			this.hotelService.updateHotel(hotel);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

}
