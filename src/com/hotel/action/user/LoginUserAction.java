package com.hotel.action.user;

import java.util.Map;

import com.hotel.bean.User;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginUserAction extends ActionSupport{
	private User user;
	private UserService userService;
	private String userName;
	private String userPassword;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	@SuppressWarnings("unchecked")
	public String execute() throws Exception{
		User user;
		System.out.println(userName+","+userPassword);
		try {
			System.out.println("login user");
			user = this.userService.loginUser(userName,userPassword);
			Map session=(Map) ActionContext.getContext().getSession();
			session.put("user", user);
			
			System.out.println(user);
			if(user!=null){
				return SUCCESS;
			}
			return INPUT;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
		
	}

}
