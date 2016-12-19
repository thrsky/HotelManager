package com.hotel.action.hotel;
import java.util.Map;

import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
@SuppressWarnings("serial")
public class ListHotelAction extends ActionSupport{
	

private HotelService hotelService;
	
	public HotelService getHotelService() {
		return hotelService;
	}

	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}

	@SuppressWarnings("unchecked")
	@Override
	public String execute() throws Exception {
		Map request = (Map)ActionContext.getContext().get("request");
		
		request.put("list", this.hotelService.findAllHotel());
		
		return SUCCESS;
	}

}
