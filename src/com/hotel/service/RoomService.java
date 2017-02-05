package com.hotel.service;

import java.sql.Timestamp;
import java.util.List;

import com.hotel.bean.Room;

public interface RoomService {
	public void addRoom(Room room);
	public List<Room> findAllRoom();
	public void deleteRoom(Room room);
	public void updateRoom(Room room);
	public Room findRoomById(Long roomId);
	public List<Room> findRoomByType(String status);
	public List<Room> findFreeRoomByHotelIdAndTime(long hotelId,Timestamp inDate,Timestamp outDate);
	public boolean RoomIsFree(long roomId);
	public List<Room> findRoomByWorker(long workerId);

}
