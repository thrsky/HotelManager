package com.hotel.action.user;


import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.hotel.bean.User;
import com.hotel.service.UserService;

@SuppressWarnings("serial")
public class SaveUserAction extends ActionSupport {
	
	private String userRealname;
	private String userEmail;
	private String userPhone;
	private String userName;
	private UserService userService;
	private String userPassword;
	public String getUserRealname() {
		return userRealname;
	}

	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
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


	@Override
	public String execute() throws Exception {
		User user = new User();
		user.setUserRealname(userRealname);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserPhone(userPhone);
		user.setUserEmail(userEmail);
		user.setUserRealname(userRealname);
		user.setUserStatus(2);
		user.setUserIntegration(0);
		
		try {
			
			System.out.println(user);
			System.out.println(userRealname+userEmail+userPhone+userName+userPassword);
			if(this.userService.addUser(user)){
				return SUCCESS;
			}
			return INPUT;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


}
