package com.hotel.action.user;

import java.util.Map;

import com.hotel.bean.User;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private User user;
	private UserService userService;
	private String info;
	private Map session;
	private Map request;
	
	
	public UserAction(){
		this.session=ActionContext.getContext().getSession();
		this.request=(Map) ActionContext.getContext().get("request");
	}
	
	public String getInfo(){
		return info;
	}
	public void setInfo(String info){
		this.info=info;
	}
	public User getUser(){
		return user;
	}
	public void setUser(User user){
		this.user=user;
	}
	public UserService getUserService(){
		return userService;
	}
	public void getUserService(UserService userService){
		this.userService=userService;
	}
	
	//=======================================================
	
	
	public String execute() throws Exception{
		
		return SUCCESS;
	}
	public String login() throws Exception{
		User userLogin=userService.loginUser(user);
		if(userLogin!=null){
//			Map session = ActionContext.getContext().getSession();
//			Map requset = (Map) ActionContext.getContext().get("request");
			
			this.session.put("user", userLogin);
			return SUCCESS;
		}
		return INPUT;
	}
	public String loginOut() throws Exception{

		
		try{
			this.session.remove("user");
		}catch(Exception e){
			e.printStackTrace();
		}
			
		return INPUT;
		
	}
	public String userUpdateInfo(){
		
		User user=(User) this.session.get("user");
		String id=String.valueOf(user.getUserId());
		this.user=this.userService.findUserById(id);
		return "UPDATE";
		
	}
	public String updateUser(){
		this.userService.updateUser(user);
		info="修改信息成功";
		return "updateSuc";
	}

}
