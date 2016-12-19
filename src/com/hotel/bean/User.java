package com.hotel.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

@SuppressWarnings("serial")
public class User implements java.io.Serializable {

	// Fields

	private Long userId;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userRealname;
	private String userPassword;
	private String userGender;
	private String userIdnumber;
	private Integer userIntegration;
	private Integer userStatus;
	private Set messages = new HashSet(0);
	private Login login;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userName, String userPhone, String userEmail, String userPassword, Integer userIntegration, Integer userStatus) {
		this.userName = userName;
		this.userPhone=userPhone;
		this.userEmail=userEmail;
		this.userPassword = userPassword;
		this.userIntegration = userIntegration;
		this.userStatus = userStatus;
	}

	/** full constructor */
	public User(String userName, String userPhone, String userEmail, String userRealname, String userPassword,
			String userGender, String userIdnumber, Integer userIntegration, Integer userStatus, Set messages,
			Login login, Set orders) {
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userRealname = userRealname;
		this.userPassword = userPassword;
		this.userGender = userGender;
		this.userIdnumber = userIdnumber;
		this.userIntegration = userIntegration;
		this.userStatus = userStatus;
		this.messages = messages;
		this.login = login;
		this.orders = orders;
	}

	// Property accessors

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserRealname() {
		return this.userRealname;
	}

	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserIdnumber() {
		return this.userIdnumber;
	}

	public void setUserIdnumber(String userIdnumber) {
		this.userIdnumber = userIdnumber;
	}

	public Integer getUserIntegration() {
		return this.userIntegration;
	}

	public void setUserIntegration(Integer userIntegration) {
		this.userIntegration = userIntegration;
	}

	public Integer getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public Set getMessages() {
		return this.messages;
	}

	public void setMessages(Set messages) {
		this.messages = messages;
	}

	public Login getLogin() {
		return this.login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}