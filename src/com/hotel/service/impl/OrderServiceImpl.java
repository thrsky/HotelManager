package com.hotel.service.impl;

import java.sql.Timestamp;
import java.util.List;

import com.hotel.bean.Hotel;
import com.hotel.bean.Order;
import com.hotel.bean.Room;
import com.hotel.bean.User;
import com.hotel.dao.HotelDao;
import com.hotel.dao.OrderDao;
import com.hotel.dao.RoomDao;
import com.hotel.dao.UserDao;
import com.hotel.dao.WorkerDao;
import com.hotel.service.OrderService;

public class OrderServiceImpl implements OrderService{

	long orderIID;
	private boolean roomStat;
	private RoomDao roomDao;
	private HotelDao hotelDao;
	private WorkerDao workerDao;
	private UserDao userDao;
	public long getOrderIID() {
		return orderIID;
	}

	public void setOrderIID(long orderIID) {
		this.orderIID = orderIID;
	}

	public HotelDao getHotelDao() {
		return hotelDao;
	}

	public void setHotelDao(HotelDao hotelDao) {
		this.hotelDao = hotelDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	private OrderDao orderDao;
	

	@Override
	public void deleteOrder(long orderId) {
		// TODO Auto-generated method stub
		this.orderDao.deleteOrder(orderId);
	}

	@Override
	public void addOrder(Timestamp inDate, Timestamp outDate,long userId, long roomId , String remark,int userusedIntegration) {
		// TODO Auto-generated method stub
		User user=this.userDao.findUserById(userId);
		Order order = new Order();
		Timestamp d = new Timestamp(System.currentTimeMillis());
		order.setOrderDate(d);
		order.setOrderInDate(inDate);
		order.setOrderOutDate(outDate);
		int days = (int) ((outDate.getTime()-inDate.getTime()+2*60*60*1000)/(1000*60*60*24));
		double pr = this.roomDao.findRoomById(roomId).getRoomPrice();
		order.setOrderPrice(pr*days-userusedIntegration/20);
		order.setOrderStatus("待审核");
		order.setUser(user);
		Room roomByRoomId = this.roomDao.findRoomById(roomId);
		order.setRoomByRoomId(roomByRoomId);
		long hotelId=roomByRoomId.getHotel().getHotelId();
		order.setOrderRemark(remark);
		order.setHotelId(hotelId);
		System.out.println("add order ing");
		System.out.println(inDate);
		System.out.println(outDate);
		user.setUserIntegration(user.getUserIntegration()-userusedIntegration);
		this.userDao.updateUser(user);
		this.orderDao.addOrder(order);
	}

	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	@Override
	public List<Order> findOrderByUserName(String userName) {
		// TODO Auto-generated method stub
		return this.orderDao.findAllOrderByUser(userName);
	}

	public boolean isRoomStat() {
		return roomStat;
	}

	public void setRoomStat(boolean roomStat) {
		this.roomStat = roomStat;
	}

	@Override
	public List<Order> findOrderByValues(String userName, String userPhone, String userIdnumber) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrdersByValues(userName, userPhone, userIdnumber);
	}

	@Override
	public List<Order> findOrdersByUserId(long userId) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrdersByUserId(userId);
	}

	@Override
	public List<Order> findOrdersByWorker(long workerId) {
		long hotelId=this.workerDao.findWorkerById(workerId).getHotel().getHotelId();
		return this.orderDao.findOrdersByHotel(hotelId);
	}

	public WorkerDao getWorkerDao() {
		return workerDao;
	}

	public void setWorkerDao(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}

	@Override
	public void peopleAddOrder(Timestamp inDate, Timestamp outDate, String userPhone, long roomId, String remark,
			String userIdnumber) {
		
		User people= new User();
		people.setUserPassword("123456");
		people.setUserIdnumber(userIdnumber);
		people.setUserPhone(userPhone);
		people.setUserIntegration(0);
		people.setUserStatus(3);
		this.userDao.addUser(people);
		long userId=this.userDao.findUserByPhone(userPhone).getUserId();
		
		Order order = new Order();
		Timestamp d = new Timestamp(System.currentTimeMillis());
		order.setOrderDate(d);
		order.setOrderInDate(inDate);
		order.setOrderOutDate(outDate);
		int days = (int) ((outDate.getTime()-inDate.getTime()+2*60*60*1000)/(1000*60*60*24));
		double pr = this.roomDao.findRoomById(roomId).getRoomPrice();
		order.setOrderPrice(pr*days);
		order.setOrderStatus("待审核");
		order.setUser(people);
		Room roomByRoomId = this.roomDao.findRoomById(roomId);
		order.setRoomByRoomId(roomByRoomId);
		long hotelId=roomByRoomId.getHotel().getHotelId();
		order.setOrderRemark(remark);
		order.setHotelId(hotelId);
		System.out.println("add order ing");
		System.out.println(inDate);
		System.out.println(outDate);	
		this.orderDao.addOrder(order);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Order findOrderById(long orderId) {
		// TODO Auto-generated method stub
		return this.orderDao.findOrderById(orderId);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.orderDao.updateOrder(order);
	}

}
