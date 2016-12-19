package com.hotel.action.user;

import java.util.Map;

import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ListUserAction extends ActionSupport{
	
	private UserService userService;
	public UserService getUserService(){
		return userService;
	}
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	
	@Override
	public String execute() throws Exception {
		Map request = (Map) ActionContext.getContext().get("request");

		request.put("list", this.userService.findAllUsers());

		return SUCCESS;
	}


}
