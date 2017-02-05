package com.hotel.bean;

import java.sql.Timestamp;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long orderId;
	private Room roomByRoomId;
	private User user;
	private Timestamp orderDate;
	private Timestamp orderInDate;
	private Timestamp orderOutDate;
	private Double orderPrice;
	private String orderStatus;
	private String orderRemark;
	private long hotelId;
	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Long orderId, Room roomByRoomId, User user, Timestamp orderDate,
			Timestamp orderInDate, Timestamp orderOutDate, Double orderPrice, String orderStatus) {
		this.orderId = orderId;
		this.roomByRoomId = roomByRoomId;
		this.user = user;
		this.orderDate = orderDate;
		this.orderInDate = orderInDate;
		this.orderOutDate = orderOutDate;
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
	}

	/** full constructor */
	public Order(Long orderId, Room roomByRoomId, User user, Timestamp orderDate,
			Timestamp orderInDate, Timestamp orderOutDate, Double orderPrice, String orderStatus, String orderRemark) {
		this.orderId = orderId;
		this.roomByRoomId = roomByRoomId;
		this.user = user;
		this.orderDate = orderDate;
		this.orderInDate = orderInDate;
		this.orderOutDate = orderOutDate;
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
		this.orderRemark = orderRemark;
	}

	// Property accessors

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Room getRoomByRoomId() {
		return this.roomByRoomId;
	}

	public void setRoomByRoomId(Room roomByRoomId) {
		this.roomByRoomId = roomByRoomId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Timestamp getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}

	public Timestamp getOrderInDate() {
		return this.orderInDate;
	}

	public void setOrderInDate(Timestamp orderInDate) {
		this.orderInDate = orderInDate;
	}

	public Timestamp getOrderOutDate() {
		return this.orderOutDate;
	}

	public void setOrderOutDate(Timestamp orderOutDate) {
		this.orderOutDate = orderOutDate;
	}

	public Double getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderRemark() {
		return this.orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public long getHotelId() {
		return hotelId;
	}

	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

}