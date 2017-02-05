package com.hotel.bean;

import java.sql.Timestamp;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Long adminId;
	private String adminUserName;
	private String adminPassword;
	private String adminRealName;
	private Timestamp adminLoginLastTime;
	private String adminLoginLastIp;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** minimal constructor */
	public Admin(String adminUserName, String adminPassword, Timestamp adminLoginLastTime,
			String adminLoginLastIp) {
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
		this.adminLoginLastTime = adminLoginLastTime;
		this.adminLoginLastIp = adminLoginLastIp;
	}

	/** full constructor */
	public Admin(String adminUserName, String adminPassword, String adminRealName,
			Timestamp adminLoginLastTime, String adminLoginLastIp) {
		this.adminUserName = adminUserName;
		this.adminPassword = adminPassword;
		this.adminRealName = adminRealName;
		this.adminLoginLastTime = adminLoginLastTime;
		this.adminLoginLastIp = adminLoginLastIp;
	}

	// Property accessors

	public Long getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminUserName() {
		return this.adminUserName;
	}

	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	public String getAdminPassword() {
		return this.adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminRealName() {
		return this.adminRealName;
	}

	public void setAdminRealName(String adminRealName) {
		this.adminRealName = adminRealName;
	}

	public Timestamp getAdminLoginLastTime() {
		return this.adminLoginLastTime;
	}

	public void setAdminLoginLastTime(Timestamp adminLoginLastTime) {
		this.adminLoginLastTime = adminLoginLastTime;
	}

	public String getAdminLoginLastIp() {
		return this.adminLoginLastIp;
	}

	public void setAdminLoginLastIp(String adminLoginLastIp) {
		this.adminLoginLastIp = adminLoginLastIp;
	}

}