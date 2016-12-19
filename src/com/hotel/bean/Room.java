package com.hotel.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Room entity. @author MyEclipse Persistence Tools
 */

public class Room implements java.io.Serializable {

	// Fields

	private Long roomId;
	private Hotel hotel;
	private Integer roomNumber;
	private String roomType;
	private Integer roomFllor;
	private Double roomSize;
	private Double roomPrice;
	private String roomStatus;
	private String roomInfo;
	private Integer roomBedNum;
	private String roomRemark;
	private Set messagesForRoomId = new HashSet(0);
	private Set ordersForHotelId = new HashSet(0);
	private Set ordersForRoomId = new HashSet(0);
	private Set messagesForHotelId = new HashSet(0);

	// Constructors

	/** default constructor */
	public Room() {
	}

	/** minimal constructor */
	public Room(Long roomId, Hotel hotel, Integer roomNumber, String roomType, Double roomPrice, String roomStatus) {
		this.roomId = roomId;
		this.hotel = hotel;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.roomStatus = roomStatus;
	}

	/** full constructor */
	public Room(Long roomId, Hotel hotel, Integer roomNumber, String roomType, Integer roomFllor, Double roomSize,
			Double roomPrice, String roomStatus, String roomInfo, Integer roomBedNum, String roomRemark,
			Set messagesForRoomId, Set ordersForHotelId, Set ordersForRoomId, Set messagesForHotelId) {
		this.roomId = roomId;
		this.hotel = hotel;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomFllor = roomFllor;
		this.roomSize = roomSize;
		this.roomPrice = roomPrice;
		this.roomStatus = roomStatus;
		this.roomInfo = roomInfo;
		this.roomBedNum = roomBedNum;
		this.roomRemark = roomRemark;
		this.messagesForRoomId = messagesForRoomId;
		this.ordersForHotelId = ordersForHotelId;
		this.ordersForRoomId = ordersForRoomId;
		this.messagesForHotelId = messagesForHotelId;
	}

	// Property accessors

	public Long getRoomId() {
		return this.roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Integer getRoomNumber() {
		return this.roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Integer getRoomFllor() {
		return this.roomFllor;
	}

	public void setRoomFllor(Integer roomFllor) {
		this.roomFllor = roomFllor;
	}

	public Double getRoomSize() {
		return this.roomSize;
	}

	public void setRoomSize(Double roomSize) {
		this.roomSize = roomSize;
	}

	public Double getRoomPrice() {
		return this.roomPrice;
	}

	public void setRoomPrice(Double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getRoomStatus() {
		return this.roomStatus;
	}

	public void setRoomStatus(String roomStatus) {
		this.roomStatus = roomStatus;
	}

	public String getRoomInfo() {
		return this.roomInfo;
	}

	public void setRoomInfo(String roomInfo) {
		this.roomInfo = roomInfo;
	}

	public Integer getRoomBedNum() {
		return this.roomBedNum;
	}

	public void setRoomBedNum(Integer roomBedNum) {
		this.roomBedNum = roomBedNum;
	}

	public String getRoomRemark() {
		return this.roomRemark;
	}

	public void setRoomRemark(String roomRemark) {
		this.roomRemark = roomRemark;
	}

	public Set getMessagesForRoomId() {
		return this.messagesForRoomId;
	}

	public void setMessagesForRoomId(Set messagesForRoomId) {
		this.messagesForRoomId = messagesForRoomId;
	}

	public Set getOrdersForHotelId() {
		return this.ordersForHotelId;
	}

	public void setOrdersForHotelId(Set ordersForHotelId) {
		this.ordersForHotelId = ordersForHotelId;
	}

	public Set getOrdersForRoomId() {
		return this.ordersForRoomId;
	}

	public void setOrdersForRoomId(Set ordersForRoomId) {
		this.ordersForRoomId = ordersForRoomId;
	}

	public Set getMessagesForHotelId() {
		return this.messagesForHotelId;
	}

	public void setMessagesForHotelId(Set messagesForHotelId) {
		this.messagesForHotelId = messagesForHotelId;
	}

}