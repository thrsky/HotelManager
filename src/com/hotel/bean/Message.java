package com.hotel.bean;

import java.sql.Timestamp;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Long messageId;
	private Room roomByHotelId;
	private Room roomByRoomId;
	private User user;
	private String messageValue;
	private Timestamp messageDate;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** full constructor */
	public Message(Long messageId, Room roomByHotelId, Room roomByRoomId, User user, String messageValue,
			Timestamp messageDate) {
		this.messageId = messageId;
		this.roomByHotelId = roomByHotelId;
		this.roomByRoomId = roomByRoomId;
		this.user = user;
		this.messageValue = messageValue;
		this.messageDate = messageDate;
	}

	// Property accessors

	public Long getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public Room getRoomByHotelId() {
		return this.roomByHotelId;
	}

	public void setRoomByHotelId(Room roomByHotelId) {
		this.roomByHotelId = roomByHotelId;
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

	public String getMessageValue() {
		return this.messageValue;
	}

	public void setMessageValue(String messageValue) {
		this.messageValue = messageValue;
	}

	public Timestamp getMessageDate() {
		return this.messageDate;
	}

	public void setMessageDate(Timestamp messageDate) {
		this.messageDate = messageDate;
	}

}