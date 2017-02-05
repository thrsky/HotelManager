package com.hotel.dao;

import java.util.List;

import com.hotel.bean.User;

public interface UserDao {
	public boolean chcekUser(User user);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	
	public List<User> findAllUsers();
	public User findUserById(long id);
	public User findUserByPhone(String phone);
	public List<User> findUser(String name);
	public User loginUser(String name,String password);
}
