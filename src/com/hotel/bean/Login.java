package com.hotel.bean;

import java.sql.Timestamp;

/**
 * Login entity. @author MyEclipse Persistence Tools
 */

public class Login implements java.io.Serializable {

	// Fields

	private Long userId;
	private User user;
	private String userIp;
	private Timestamp loginDate;
	private Integer loginNum;

	// Constructors

	/** default constructor */
	public Login() {
	}

	/** full constructor */
	public Login(Long userId, User user, String userIp, Timestamp loginDate, Integer loginNum) {
		this.userId = userId;
		this.user = user;
		this.userIp = userIp;
		this.loginDate = loginDate;
		this.loginNum = loginNum;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

	public Timestamp getLoginDate() {
		return this.loginDate;
	}

	public void setLoginDate(Timestamp loginDate) {
		this.loginDate = loginDate;
	}

	public Integer getLoginNum() {
		return this.loginNum;
	}

	public void setLoginNum(Integer loginNum) {
		this.loginNum = loginNum;
	}

}