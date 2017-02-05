package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.User;
import com.hotel.dao.UserDao;
import com.hotel.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public UserDao getUserDao(){
		return userDao;
	}
	public void setUserDao(UserDao userDao){
		this.userDao=userDao;
	}
	
	
	//----------------------------------------------------------
	@Override
	public boolean chcekUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.chcekUser(user);
	}
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.addUser(user);
	}
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.updateUser(user);
	}
	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return this.userDao.deleteUser(user);
	}
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return this.userDao.findAllUsers();
	}
	@Override
	public List<User> findUser(String value) {
		// TODO Auto-generated method stub
		return this.findUser(value);
	}
	@Override
	public User loginUser(String name,String password) {
		// TODO Auto-generated method stub
		return this.userDao.loginUser(name,password);
	}
	@Override
	public User findUserById(long id) {
		// TODO Auto-generated method stub
		return this.userDao.findUserById(id);
	}
}
