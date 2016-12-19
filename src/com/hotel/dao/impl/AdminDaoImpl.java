package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.hotel.bean.Admin;
import com.hotel.dao.AdminDao;

public class AdminDaoImpl extends HibernateDaoSupport implements AdminDao{

	@Override
	public void addAdmin(Admin admin) {
		this.getHibernateTemplate().save(admin);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAdmin(long adminId) {
		Admin admin;
		String id=Long.toString(adminId);
		String hql="from admin admin where admin.adminId=?";		
		admin=(Admin) getHibernateTemplate().find(hql, id);
		this.getHibernateTemplate().delete(admin);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Admin> findAllAdmin() {
		String hql="from Admin admin order by admin.adminId desc";
		// TODO Auto-generated method stub
		return (List<Admin>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public void updateAdmin(Admin admin) {
		this.getHibernateTemplate().update(admin);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Admin findAdminById(long adminId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Admin.class,adminId);
	}

	@Override
	public List<Admin> findAdminByName(String adminName) {
		// TODO Auto-generated method stub
		String hql="from Admin admin where admin.adminUserName like ?";
		return (List<Admin>) this.getHibernateTemplate().find(hql, "%"+adminName+"%");
	}

	@Override
	public Admin loginAdmin(String adminName, String adminPassword) {
		// TODO Auto-generated method stub
		String hql="from Admin admin where admin.adminUserName=? and admin.adminPassword=?";
		
		return (Admin) this.getHibernateTemplate().find(hql, new String[]{adminName,adminPassword});
	}

}
