package com.hotel.dao.impl;

import java.util.List;

import org.hibernate.FlushMode;
import org.hibernate.SQLQuery;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.bean.Order;
import com.hotel.dao.HotelDao;
import com.hotel.dao.OrderDao;
import com.hotel.dao.WorkerDao;
@Transactional
public class OrderDaoImpl extends HibernateDaoSupport implements OrderDao{


	@Override
	public void addOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		this.getHibernateTemplate().save(order);
		
	}

	@Override
	public List<Order> findAllOrderByUser(String userName) {
		// TODO Auto-generated method stub
		String hql="from Order order where order.userId=?";
		return (List<Order>) this.getHibernateTemplate().find(hql, userName);
	}

	@Override
	public void deleteOrder(long orderId) {
		// TODO Auto-generated method stub
		Order order;
		String hql="from Order order where order.orderId=?";
		order=(Order) this.getHibernateTemplate().find(hql, orderId).get(0);
		this.getHibernateTemplate().delete(order);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findAllOrder() {
		// TODO Auto-generated method stub
		return (List<Order>) this.getHibernateTemplate().find("from Order order");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findOrderByRoomId(long roomId) {
		// TODO Auto-generated method stub
		String hql="from Order order where order.roomByRoomId.roomId=?";
		return (List<Order>) this.getHibernateTemplate().find(hql, roomId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> findOrdersByValues(String userName, String userPhone, String userIdnumber) {
		// TODO Auto-generated method stub
		String hql="from Order order where order.user.userName=? or order.user.userPhone=? or order.user.userIdnumber=?";
		return (List<Order>) this.getHibernateTemplate().find(hql,new String[]{userName,userPhone,userIdnumber});
	}

	@Override
	public List<Order> findOrdersByUserId(long userId) {
		String hql="from Order order where order.user.userId=?";
		// TODO Auto-generated method stub
		return (List<Order>) this.getHibernateTemplate().find(hql, userId);
	}

	@Override
	public List<Order> findOrdersByHotel(long hotelId) {
		// TODO Auto-generated method stub
		String hql="from Order o where o.hotelId=?";
		return (List<Order>) this.getHibernateTemplate().find(hql, hotelId);
	}

	@Override
	public Order findOrderById(long orderId) {
		// TODO Auto-generated method stub
		String hql="From Order o where o.orderId=?";
		return (Order) this.getHibernateTemplate().find(hql, orderId).get(0);
	}

	@Override
	public void updateOrder(Order order) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(order);
	}



}
