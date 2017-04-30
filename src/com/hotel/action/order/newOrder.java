package com.hotel.action.order;

import java.sql.Timestamp;
import java.util.Map;

import com.hotel.bean.Hotel;
import com.hotel.bean.Order;
import com.hotel.bean.Room;
import com.hotel.service.HotelService;
import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class newOrder extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int userusedIntegration;
	private long userId;
	private String userPhone;
	private String userIdnumber;
	private long roomId;
	private String remark;
	private Timestamp inDate;
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserIdnumber() {
		return userIdnumber;
	}
	public void setUserIdnumber(String userIdnumber) {
		this.userIdnumber = userIdnumber;
	}
	public int getUserusedIntegration() {
		return userusedIntegration;
	}
	public void setUserusedIntegration(int userusedIntegration) {
		this.userusedIntegration = userusedIntegration;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public Timestamp getInDate() {
		return inDate;
	}
	public void setInDate(Timestamp inDate) {
		this.inDate = inDate;
	}
	public Timestamp getOutDate() {
		return outDate;
	}
	public void setOutDate(Timestamp outDate) {
		this.outDate = outDate;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	private Timestamp outDate;
	private int days;
	private String hotelName;
	private OrderService orderService;
	private RoomService roomService;
	private UserService userService;
	
	
	public String userNewOrder() throws Exception{
		try{
			Timestamp now=new Timestamp(System.currentTimeMillis());
			if(now.getTime()<inDate.getTime()){
				return INPUT;
			}
			this.orderService.addOrder(inDate, outDate, userId, roomId, remark,userusedIntegration);
			Map session=(Map) ActionContext.getContext().getSession();
			session.put("userusedIntegration", userusedIntegration);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("inDate", inDate);
			request.put("outDate", outDate);
			Timestamp d = new Timestamp(System.currentTimeMillis()); 
			request.put("orderDate", d);
			return SUCCESS;
		}catch (Exception e){
			System.out.println(e);
			return INPUT;
		}
		
	}
	
	public String peopleNewOrder() throws Exception{
		try {
			this.orderService.peopleAddOrder(inDate, outDate, userPhone, roomId, remark, userIdnumber);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("inDate", inDate);
			request.put("outDate", outDate);
			Timestamp d = new Timestamp(System.currentTimeMillis()); 
			request.put("orderDate", d);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
}
