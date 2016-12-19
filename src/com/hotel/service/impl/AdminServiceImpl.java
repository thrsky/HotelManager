package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.Admin;
import com.hotel.dao.AdminDao;
import com.hotel.service.AdminService;

public class AdminServiceImpl implements AdminService{

	
	private AdminDao adminDao;
	public AdminDao getAdminDao(){
		return adminDao;
	}
	public void setAdminDao(AdminDao adminDao){
		this.adminDao=adminDao;
	}
	
	@Override
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		this.adminDao.addAdmin(admin);
		
	}

	@Override
	public void deleteAdmin(long adminId) {
		this.adminDao.deleteAdmin(adminId);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return (List<Admin>)this.adminDao.findAllAdmin();
	}

	@Override
	public void updateAdmin(Admin admin) {
		this.adminDao.updateAdmin(admin);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin findAdminById(long adminId) {
		// TODO Auto-generated method stub
		return this.adminDao.findAdminById(adminId);
	}

	@Override
	public List<Admin> findAdminByName(String adminName) {
		// TODO Auto-generated method stub
		return (List<Admin>)this.adminDao.findAdminByName(adminName);
	}
	@Override
	public Admin loginAdmin(String adminName, String adminPassword) {
		// TODO Auto-generated method stub
		return this.adminDao.loginAdmin(adminName, adminPassword);
	}

}
