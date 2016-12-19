package com.hotel.dao.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.hotel.bean.User;
import com.hotel.dao.UserDao;

/*
 * 基本  dao 的实现
 * thrsky
 * 2016/12/8
 *
 */
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public boolean chcekUser(User user) {
		// TODO Auto-generated method stub
		if (user!=null){
			
			String hql="from user where userName=? or userPhone=? or userEmail=? and userPassword=?";
			String name=user.getUserName();
			String phone=user.getUserPhone();
			String email=user.getUserEmail();
			String password=user.getUserPassword();
			List<User> list=(List<User>) this.getHibernateTemplate().find(hql,new String[]{name,phone,email,password});
			
			if (!list.isEmpty()){
				return true;
			}else{
				return false;
			}
		}
		else{
			return false;
		}
	}

	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().update(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().delete(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		String hql="from User user order by user.userId DESC";
		return (List<User>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public List<User> findUser(String value) {
		// TODO Auto-generated method stub
		String hql="from user where userName like %?% or userId = ?";
		
		return (List<User>)this.getHibernateTemplate().find(hql,value);
	}

	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		String hql="from user where userName=? or userPhone=? or userEmail=? and userPassword=?";
		String name=user.getUserName();
		String phone=user.getUserPhone();
		String email=user.getUserEmail();
		String password=user.getUserPassword();
		List<User> list=(List<User>) this.getHibernateTemplate().find(hql,new String[]{name,phone,email,password});
		if(list.size()>0){
			return list.get(0);
		}
		return null;
	}

	@Override
	public User findUserById(String value) {
		// TODO Auto-generated method stub
		String hql="from user where userId=?";
		return (User) this.getHibernateTemplate().find(hql, value);
	}
	
	

}
