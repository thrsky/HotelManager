package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.Room;
import com.hotel.dao.RoomDao;
import com.hotel.service.RoomService;

public class RoomServiceImpl implements RoomService{
	
	private RoomDao roomDao;
	public RoomDao getRoomDao(){
		return roomDao;
	}
	public void setRoomDao (RoomDao roomDao){
		this.roomDao=roomDao;
	}
	

	@Override
	public void addRoom(Room room) {
		this.roomDao.addRoom(room);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		return this.roomDao.findAllRoom();
	}

	@Override
	public void deleteRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.deleteRoom(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.updateRoom(room);
		
	}

	@Override
	public Room findRoomById(Long roomId) {
		// TODO Auto-generated method stub
		return this.roomDao.findRoomById(roomId);
	}

	@Override
	public List<Room> findRoomByType(String status) {
		// TODO Auto-generated method stub
		return this.roomDao.findRoomByType(status);
	}

}
