package com.hotel.dao;

import java.util.List;

import com.hotel.bean.Order;

public interface OrderDao {

	public void addOrder(Order order);
	public Order findOrderById(long orderId);
	public List<Order> findAllOrderByUser(String userName);
	public List<Order> findOrdersByHotel(long hotelId);
	public List<Order> findOrdersByUserId(long userId);
	public List<Order> findAllOrder();
	public void deleteOrder(long orderId);
	public void updateOrder(Order order);
	public List<Order> findOrderByRoomId(long roomId);
	public List<Order> findOrdersByValues(String userName,String userPhone,String userIdnumber);
} 
