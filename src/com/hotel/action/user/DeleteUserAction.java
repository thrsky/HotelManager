package com.hotel.action.user;

import com.hotel.bean.User;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserAction extends ActionSupport{

	private long userId;
	private User user;
	private UserService userService;
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user=user;
	}
	public UserService getUserService(){
		return userService;
	}
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	
	//======================================================
	
	public String execute() throws Exception{
		try {
			User user =this.userService.findUserById(userId);
			this.userService.deleteUser(user);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	
}
