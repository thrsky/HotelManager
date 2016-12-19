package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.hotel.bean.Room;
import com.hotel.dao.RoomDao;

public class RoomDaoImpl  extends HibernateDaoSupport implements RoomDao{

	@Override
	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(room);
		
	}

	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		String hql="from Room room order by room.hotelId,room.roomId desc";
		return (List<Room>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public void deleteRoom(Room room) {
		this.getHibernateTemplate().delete(room);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRoom(Room room) {
		this.getHibernateTemplate().delete(room);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Room findRoomById(Long roomId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Room.class, roomId);
	}

	@Override
	public List<Room> findRoomByType(String status) {
		// TODO Auto-generated method stub
		return (List<Room>) this.getHibernateTemplate().get(Room.class, status);
	}
	

}
