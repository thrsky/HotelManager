package com.hotel.bean;

import java.sql.Timestamp;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */

public class Message implements java.io.Serializable {

	// Fields

	private Long messageId;
	private Hotel hotel;
	private User user;
	private String messageValue;
	private Timestamp messageDate;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** full constructor */
	public Message(Long messageId, Hotel hotel, User user, String messageValue,
			Timestamp messageDate) {
		this.messageId = messageId;
		this.setHotel(hotel);
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

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

}