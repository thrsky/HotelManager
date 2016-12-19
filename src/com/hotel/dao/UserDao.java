package com.hotel.dao;

import java.util.List;

import com.hotel.bean.User;

public interface UserDao {
	public void saveUser(User user);
	public boolean chcekUser(User user);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	
	public List<User> findAllUsers();
	public User findUserById(String value);
	public List<User> findUser(String neme);
	public User loginUser(User user);
}
