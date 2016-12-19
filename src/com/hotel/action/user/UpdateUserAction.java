package com.hotel.action.user;

import com.hotel.bean.User;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport{

	private User user;
	private UserService userService;
	public User getUser(){
		return user;
	}
	public void serUser(User user){
		this.user=user;
	}
	public UserService getUserService(){
		return userService;
	}
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	
	//========================================================
	
	public String execute() throws Exception{
		this.userService.updateUser(user);
		return SUCCESS;
	}
	
}
