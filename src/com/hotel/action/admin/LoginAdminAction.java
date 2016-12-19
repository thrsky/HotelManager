package com.hotel.action.admin;

import com.hotel.bean.Admin;
import com.hotel.service.AdminService;
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
	
	
	public String execute() throws Exception{
		this.adminService.loginAdmin(adminUserName, adminPassword);
		return SUCCESS;
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
	

}
