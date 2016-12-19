package com.hotel.service;

import java.util.List;

import com.hotel.bean.Admin;

public interface AdminService {
	public Admin loginAdmin(String adminName,String adminPassword);
	public void addAdmin(Admin admin);
	public void deleteAdmin(long adminId);
	public List<Admin> findAllAdmin();
	public void updateAdmin (Admin admin);
	public Admin findAdminById(long adminId);
	public List<Admin> findAdminByName(String adminName);

}
