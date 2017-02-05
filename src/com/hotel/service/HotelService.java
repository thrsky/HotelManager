package com.hotel.service;

import java.util.List;

import com.hotel.bean.Hotel;

public interface HotelService {
	public void addHotel(Hotel hotel);
	public List<Hotel> findAllHotel();
	public void deleteHotel(Hotel hotel);
	public void updateHotel(Hotel hotel);
	public Hotel findHotelById(Long hotelId);
	public List<Hotel> findHotelByCityAndName(String hotelCity,String hotelName);
	public List<Hotel> findHotelByName(String hotelName);
}
