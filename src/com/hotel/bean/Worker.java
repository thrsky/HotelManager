package com.hotel.bean;

/**
 * Worker entity. @author MyEclipse Persistence Tools
 */

public class Worker implements java.io.Serializable {

	// Fields

	private Long workerId;
	private Hotel hotel;
	private String workerName;
	private String workerPassword;
	private String workerPhone;
	private String workerGender;
	private String workerEmail;

	// Constructors

	/** default constructor */
	public Worker() {
	}

	/** minimal constructor */
	public Worker( Hotel hotel, String workerName, String workerPassword) {
		this.hotel = hotel;
		this.workerName = workerName;
		this.workerPassword = workerPassword;
	}

	/** full constructor */
	public Worker(Hotel hotel, String workerName, String workerPassword, String workerPhone,
			String workerGender, String workerEmail) {
		this.hotel = hotel;
		this.workerName = workerName;
		this.workerPassword = workerPassword;
		this.workerPhone = workerPhone;
		this.workerGender = workerGender;
		this.workerEmail = workerEmail;
	}

	// Property accessors

	public Long getWorkerId() {
		return this.workerId;
	}

	public void setWorkerId(Long workerId) {
		this.workerId = workerId;
	}

	public Hotel getHotel() {
		return this.hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public String getWorkerName() {
		return this.workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getWorkerPassword() {
		return this.workerPassword;
	}

	public void setWorkerPassword(String workerPassword) {
		this.workerPassword = workerPassword;
	}

	public String getWorkerPhone() {
		return this.workerPhone;
	}

	public void setWorkerPhone(String workerPhone) {
		this.workerPhone = workerPhone;
	}

	public String getWorkerGender() {
		return this.workerGender;
	}

	public void setWorkerGender(String workerGender) {
		this.workerGender = workerGender;
	}

	public String getWorkerEmail() {
		return this.workerEmail;
	}

	public void setWorkerEmail(String workerEmail) {
		this.workerEmail = workerEmail;
	}

}