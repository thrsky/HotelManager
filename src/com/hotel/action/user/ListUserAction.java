package com.hotel.action.user;

import java.util.List;
import java.util.Map;

import com.hotel.bean.User;
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
	
	public String findAllUser() throws Exception{
		
		try {
			Map request = (Map) ActionContext.getContext().get("request");
			List<User> all= this.userService.findAllUsers();
			for(int i=0;i<all.size();i++){
				User user = all.get(i);
				if(user.getUserName()==null){
					all.remove(i);
				}
			}
			request.put("alluserList", all);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}


}
