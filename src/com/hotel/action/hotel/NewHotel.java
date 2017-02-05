package com.hotel.action.hotel;

import com.hotel.bean.Hotel;
import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionSupport;

public class NewHotel extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long hotelId;
	private String hotelName;
	private String hotelCity;
	private String hotelPhone;
	private String hotelAdmin;
	private String hotelPosition;
	private String hotelDescription;
	private HotelService hotelService;
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelCity() {
		return hotelCity;
	}
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}
	public String getHotelPhone() {
		return hotelPhone;
	}
	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}
	public String getHotelAdmin() {
		return hotelAdmin;
	}
	public void setHotelAdmin(String hotelAdmin) {
		this.hotelAdmin = hotelAdmin;
	}
	public String getHotelDescription() {
		return hotelDescription;
	}
	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}
	public HotelService getHotelService() {
		return hotelService;
	}
	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	
	public String execute() throws Exception{
		try {
			Hotel hotel = new Hotel();
			hotelId=this.hotelService.findAllHotel().size()+1;
			hotel.setHotelId(hotelId);
			hotel.setHotelAdmin(hotelAdmin);
			hotel.setHotelCity(hotelCity);
			hotel.setHotelDescription(hotelDescription);
			hotel.setHotelName(hotelName);
			hotel.setHotelPhone(hotelPhone);
			hotel.setHotelPosition(hotelPosition);
			hotel.setHotelStatus("营业");
			hotel.setHotelMark(4.5);
			this.hotelService.addHotel(hotel);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	public String getHotelPosition() {
		return hotelPosition;
	}
	public void setHotelPosition(String hotelPosition) {
		this.hotelPosition = hotelPosition;
	}
}
