package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.hotel.bean.Hotel;
import com.hotel.dao.HotelDao;

public class HotelDaoImpl extends HibernateDaoSupport implements HotelDao{

	@Override
	public void addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(hotel);
	}

	@Override
	public List<Hotel> findAllHotel() {
		// TODO Auto-generated method stub
		String hql="from Hotel hotel order by hotel.hotelId desc";
		return (List<Hotel>)this.getHibernateTemplate().find(hql);
	}

	@Override
	public void deleteHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(hotel);
	}

	@Override
	public Hotel findHotelById(Long hotelId) {
		// TODO Auto-generated method stub
		return (Hotel) this.getHibernateTemplate().get(Hotel.class, hotelId);
	}

	@Override
	public List<Hotel> findHotelByName(String hotelName) {
		// TODO Auto-generated method stub
		String hql="from hotel where hotel.hotelName like ?";
		return (List<Hotel>) this.getHibernateTemplate().find(hql, "%"+hotelName+"%");
	}

}
