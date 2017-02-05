package com.hotel.action.admin;

import java.util.Map;

import com.hotel.bean.Admin;
import com.hotel.service.AdminService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAdminAction extends ActionSupport{
	
	
	private Admin admin;
	private AdminService adminService;
	private String adminUserName;
	private String adminPassword;
	public Admin getAdmin(){
		return admin;
	}
	public void setAdmin(Admin admin){
		this.admin=admin;
	}
	public AdminService getAdminService(){
		return adminService;
	}
	public void setAdminService(AdminService adminService){
		this.adminService=adminService;
	}
	
	
	public String getAdminUserName(){
		return this.adminUserName;
	}
	
	public String getAdminPassword(){
		return this.adminPassword;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	public String execute() throws Exception{
		if(adminUserName==null){
			System.out.println("nouserName");
		}
		else{
			System.out.println(adminUserName);
		}
		if(adminPassword==null){
			System.out.println("noPassword");
		}else{
			System.out.println(adminPassword);
		}
		try {
			Map session=ActionContext.getContext().getSession();	
			admin = this.adminService.loginAdmin(adminUserName, adminPassword);
			session.put("admin", admin);
			if(admin!=null){
				return SUCCESS;
			}else{
				return INPUT;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}


}
