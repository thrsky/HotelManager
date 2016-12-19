package com.hotel.dao;

import java.util.List;

import com.hotel.bean.Hotel;

public interface HotelDao {
	public void addHotel(Hotel hotel);
	public List<Hotel> findAllHotel();
	public void deleteHotel(Hotel hotel);
	public void updateHotel(Hotel hotel);
	public Hotel findHotelById(Long hotelId);
	public List<Hotel> findHotelByName(String hotelName);
}
