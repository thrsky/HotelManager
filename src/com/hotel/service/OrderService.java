package com.hotel.service;

import java.sql.Timestamp;
import java.util.List;

import com.hotel.bean.Order;

public interface OrderService {

	public void addOrder(Timestamp inDate, Timestamp outDate , long userId ,long roomId ,String remark, int userusedIntegration);

	public void deleteOrder(long orderId);
	public void peopleAddOrder(Timestamp inDate, Timestamp outDate , String userPhone ,long roomId ,String remark,String userIdnumber);
	public Order findOrderById(long orderId);
	public List<Order> findOrderByUserName(String userName);
	public void updateOrder(Order order);
	public List<Order> findOrdersByUserId(long userId);
	
	public List<Order> findOrdersByWorker(long workerId);
	
	public List<Order> findOrderByValues(String userName,String userPhone,String userIdnumber);
}
