package com.hotel.action.user;

import com.hotel.bean.User;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUser extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userRealname;
	private UserService userService;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserRealname() {
		return userRealname;
	}
	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public String execute() throws Exception{
		
		try {
			User user=this.userService.findUserById(userId);
			if(!userEmail.isEmpty()){
				user.setUserEmail(userEmail);
			}
			if(!userPhone.isEmpty()){
				user.setUserPhone(userPhone);
			}
			if(!userRealname.isEmpty()){
				user.setUserRealname(userRealname);
			}
			if(!userName.isEmpty()){
				user.setUserName(userName);
			}
			this.userService.updateUser(user);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
		
	}
}
