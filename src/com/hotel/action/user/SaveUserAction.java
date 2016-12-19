package com.hotel.action.user;


import java.util.Map;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.hotel.bean.User;
import com.hotel.service.UserService;

@SuppressWarnings("serial")
public class SaveUserAction extends ActionSupport {
	private User user;

	private UserService service;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		// 调用service相关的方法，完成实际的业务处理
		//this.service.saveUser(this.user);
		this.user.setUserName("admin");
		this.user.setUserPassword("thrshy");
		this.user.setUserPhone("18858903314");
		this.user.setUserEmail("thrsky@163.com");
		this.user.setUserRealname("likang");
		this.service.saveUser(this.user);
		return SUCCESS;
	}

	public String register() throws Exception {
		// 调用service相关的方法，完成实际的业务处理
		this.service.saveUser(this.user);

		Map session=ActionContext.getContext().getSession();
		Map request=(Map) ActionContext.getContext().get("request");
		session.put("user", this.user);
		//
		return "regSuc";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
