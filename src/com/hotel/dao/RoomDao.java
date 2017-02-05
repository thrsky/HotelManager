package com.hotel.dao;

import java.util.List;

import com.hotel.bean.Room;

public interface RoomDao {
	
	public void addRoom(Room room);
	public List<Room> findAllRoom();
	public void deleteRoom(Room room);
	public void updateRoom(Room room);
	public Room findRoomById(Long roomId);
	public List<Room> findRoomByType(String status);
	public List<Room> findRoomByHotelId(long hotelId);
	public boolean RoomIsFree(long roomId);
}
