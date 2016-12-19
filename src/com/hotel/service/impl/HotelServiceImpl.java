package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.Hotel;
import com.hotel.dao.HotelDao;
import com.hotel.service.HotelService;

public class HotelServiceImpl implements HotelService{

	private HotelDao hotelDao;
	public HotelDao getHotelDao(){return hotelDao;}
	public void setHotelDao(HotelDao hotelDao){this.hotelDao=hotelDao;}
	
	@Override
	public void addHotel(Hotel hotel) {
		
		this.hotelDao.addHotel(hotel);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Hotel> findAllHotel() {
		// TODO Auto-generated method stub
		return this.hotelDao.findAllHotel();
	}

	@Override
	public void deleteHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelDao.deleteHotel(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		this.hotelDao.updateHotel(hotel);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hotel findHotelById(Long hotelId) {
		// TODO Auto-generated method stub
		return this.hotelDao.findHotelById(hotelId);
	}

	@Override
	public List<Hotel> findHotelByName(String hotelName) {
		// TODO Auto-generated method stub
		return (List<Hotel>) this.hotelDao.findHotelByName(hotelName);
	}

}
