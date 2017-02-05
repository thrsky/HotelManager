package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.bean.Hotel;
import com.hotel.dao.HotelDao;
@Transactional
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
		String hql="from bean.Hotel hotel where hotel.hotelName like ?";
		return (List<Hotel>) this.getHibernateTemplate().find(hql, "%"+hotelName+"%");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hotel> findHotelByCityAndName(String hotelCity, String hotelName) {
		// TODO Auto-generated method stub
			if(hotelCity.length()!=0){
				if(hotelName.length()!=0){
					String hql="from Hotel hotel where hotel.hotelCity = ? and hotel.hotelName like ? and hotel.hotelStatus='营业'";
					return (List<Hotel>) this.getHibernateTemplate().find(hql, new String[]{hotelCity,"%"+hotelName+"%"});
				}else{
					//System.out.println("");
					String hql="from Hotel hotel where hotel.hotelCity = ? and hotel.hotelStatus='营业'";
					System.out.println(this.getHibernateTemplate().find(hql, hotelCity).size());
					return (List<Hotel>) this.getHibernateTemplate().find(hql,hotelCity);
				}
			}else{
				
				if(hotelName.length()>0){
					
					String hql="from Hotel hotel where hotel.hotelName like ? and hotel.hotelStatus='营业'";
					return (List<Hotel>) this.getHibernateTemplate().find(hql, "%"+hotelName+"%");
				}
				else{

					String hql="from Hotel hotel where hotel.hotelStatus='营业' order by hotel.hotelId";
					System.out.println(this.getHibernateTemplate().find(hql).size());
					return (List<Hotel>) this.getHibernateTemplate().find(hql);
				}
			}


		
	}

}
