package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.bean.Room;
import com.hotel.dao.RoomDao;
@Transactional
public class RoomDaoImpl  extends HibernateDaoSupport implements RoomDao{

	@Override
	public void addRoom(Room room) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(room);
		
	}

	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		String hql="from Room room order by room.hotel.hotelId,room.roomId desc";
		return (List<Room>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public void deleteRoom(Room room) {
		this.getHibernateTemplate().delete(room);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRoom(Room room) {
		this.getHibernateTemplate().update(room);
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

	@Override
	public List<Room> findRoomByHotelId(long hotelId) {
		// TODO Auto-generated method stub
		String hql="from Room room where room.hotel.hotelId=?";
		return (List<Room>) this.getHibernateTemplate().find(hql, hotelId);
	}

	@Override
	public boolean RoomIsFree(long roomId) {
		// TODO Auto-generated method stub
		String hql="from Room room where room.roomId=? and room.roomStatus='1'";
		if(this.getHibernateTemplate().find(hql, roomId).size()>0){
			return true;
		}
		return false;
	}

	

}
