package com.hotel.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * Hotel entity. @author MyEclipse Persistence Tools
 */

public class Hotel implements java.io.Serializable {

	// Fields

	private Long hotelId;
	private String hotelName;
	private String hotelCity;
	private String hotelPosition;
	private String hotelPhone;
	private Double hotelMark;
	private Double hotelMinimum;
	private String hotelAdmin;
	private String hotelDescription;
	private String hotelComment;
	private Set rooms = new HashSet(0);

	// Constructors

	/** default constructor */
	public Hotel() {
	}

	/** minimal constructor */
	public Hotel(Long hotelId, String hotelName, String hotelPosition, String hotelPhone, Double hotelMark) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelPosition = hotelPosition;
		this.hotelPhone = hotelPhone;
		this.hotelMark = hotelMark;
	}

	/** full constructor */
	public Hotel(Long hotelId, String hotelName, String hotelCity, String hotelPosition, String hotelPhone,
			Double hotelMark, Double hotelMinimum, String hotelAdmin, String hotelDescription, String hotelComment,
			Set rooms) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelCity = hotelCity;
		this.hotelPosition = hotelPosition;
		this.hotelPhone = hotelPhone;
		this.hotelMark = hotelMark;
		this.hotelMinimum = hotelMinimum;
		this.hotelAdmin = hotelAdmin;
		this.hotelDescription = hotelDescription;
		this.hotelComment = hotelComment;
		this.rooms = rooms;
	}

	// Property accessors

	public Long getHotelId() {
		return this.hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return this.hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelCity() {
		return this.hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelPosition() {
		return this.hotelPosition;
	}

	public void setHotelPosition(String hotelPosition) {
		this.hotelPosition = hotelPosition;
	}

	public String getHotelPhone() {
		return this.hotelPhone;
	}

	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}

	public Double getHotelMark() {
		return this.hotelMark;
	}

	public void setHotelMark(Double hotelMark) {
		this.hotelMark = hotelMark;
	}

	public Double getHotelMinimum() {
		return this.hotelMinimum;
	}

	public void setHotelMinimum(Double hotelMinimum) {
		this.hotelMinimum = hotelMinimum;
	}

	public String getHotelAdmin() {
		return this.hotelAdmin;
	}

	public void setHotelAdmin(String hotelAdmin) {
		this.hotelAdmin = hotelAdmin;
	}

	public String getHotelDescription() {
		return this.hotelDescription;
	}

	public void setHotelDescription(String hotelDescription) {
		this.hotelDescription = hotelDescription;
	}

	public String getHotelComment() {
		return this.hotelComment;
	}

	public void setHotelComment(String hotelComment) {
		this.hotelComment = hotelComment;
	}

	public Set getRooms() {
		return this.rooms;
	}

	public void setRooms(Set rooms) {
		this.rooms = rooms;
	}

}