package com.hotel.action.hotel;

import java.sql.Timestamp;
import java.util.Map;

import com.hotel.service.HotelService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindHotelByCityAndName extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HotelService hotelService;
	public String hotelCity;
	public String hotelName;
	private String time;
	private String intime="";
	private String outtime="";
	
	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public HotelService getHotelService() {
		return hotelService;
	}

	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	@SuppressWarnings({"unchecked" })
	public String execute() throws Exception{
		
		intime=time.split(" - ")[0]+" 14:00:000";
		outtime=time.split(" - ")[1]+" 12:00:000";
		Timestamp orderInDate = Timestamp.valueOf(intime);
		System.out.println(orderInDate.getTime());
		Timestamp orderOutDate = Timestamp.valueOf(outtime); 
		Timestamp now=new Timestamp(System.currentTimeMillis());
		System.out.println(now.getTime());
		if(orderInDate.getTime()<now.getTime()){
			System.out.println("时间不对");
			return INPUT;
		}
		int days = (int) ((orderOutDate.getTime()-orderInDate.getTime()+2*60*60*1000)/(1000*60*60*24));
		try {
			
			System.out.println(time);
			Map request = (Map)ActionContext.getContext().get("request");
			request.put("list", this.hotelService.findHotelByCityAndName(hotelCity, hotelName));
			Map session = ActionContext.getContext().getSession();
			session.put("intime", orderInDate);
			session.put("outtime", orderOutDate);
			session.put("days", days);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return INPUT;
		}
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
