package com.hotel.service;

import java.util.List;

import com.hotel.bean.User;

public interface UserService {
	
	public boolean chcekUser(User user);
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(User user);
	
	public List<User> findAllUsers();
	public List<User> findUser(String value);
	public User findUserById(long id);
	public User loginUser(String name,String password);
}
