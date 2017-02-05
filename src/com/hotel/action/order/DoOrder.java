package com.hotel.action.order;

import java.sql.Timestamp;
import java.util.Map;

import com.hotel.bean.Room;
import com.hotel.bean.User;
import com.hotel.service.OrderService;
import com.hotel.service.RoomService;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DoOrder extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long roomId;
	private long userId;
	private long hotelId;
	private String hotelName;

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

	private int days;
	private Timestamp inDate;

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

	private Timestamp outDate;
	private OrderService orderService;
	private UserService userService;

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

	public RoomService getRoomService() {
		return roomService;
	}

	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}

	private RoomService roomService;

	@SuppressWarnings("unchecked")
	public String execute() throws Exception {

		try {
			Room room = this.roomService.findRoomById(roomId);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("doOrder", room);
			request.put("hotelName", hotelName);
			request.put("hotelId", hotelId);
			User user = this.userService.findUserById(userId);
			// request.put("havaIt", user.getUserIntegration());
			double price = days * room.getRoomPrice();
			Map session = ActionContext.getContext().getSession();
			session.put("price", price);
			session.put("haveIt", user.getUserIntegration());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

	public String peopleDo() throws Exception {

		try {
			Room room = this.roomService.findRoomById(roomId);
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("doOrder", room);
			request.put("hotelName", hotelName);
			request.put("hotelId", hotelId);
			// request.put("havaIt", user.getUserIntegration());
			double price = days * room.getRoomPrice();
			Map session = ActionContext.getContext().getSession();
			session.put("price", price);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
