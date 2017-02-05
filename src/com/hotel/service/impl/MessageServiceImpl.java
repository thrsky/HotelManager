package com.hotel.service.impl;
import java.sql.Timestamp;
import java.util.List;

import com.hotel.bean.Hotel;
import com.hotel.bean.Message;
import com.hotel.bean.Room;
import com.hotel.bean.User;
import com.hotel.dao.HotelDao;
import com.hotel.dao.MessageDao;
import com.hotel.dao.RoomDao;
import com.hotel.dao.UserDao;
import com.hotel.service.MessageService;
public class MessageServiceImpl implements MessageService{

	private MessageDao messageDao;
	private UserDao userDao;
	private RoomDao roomDao;
	@Override
	public void addMessage(long userId, long roomId, String messageValue) {
		// TODO Auto-generated method stub
		System.out.println("开始增加留言");
		System.out.println(userId+roomId+messageValue);
		Message message = new Message();
		User user=this.userDao.findUserById(userId);
		Room room=this.roomDao.findRoomById(roomId);
		Hotel hotel=room.getHotel();
		message.setUser(user);
		message.setHotel(hotel);
		message.setMessageValue(messageValue);
		Timestamp d=new Timestamp(System.currentTimeMillis()); 
		message.setMessageDate(d);
		this.messageDao.addMessage(message);
		
	}

	@Override
	public void deleteMessage(long messageId) {
		// TODO Auto-generated method stub
		this.messageDao.deleteMessage(messageId);
	}

	@Override
	public Message findMessageById(long messageId) {
		// TODO Auto-generated method stub
		return this.messageDao.findMessageById(messageId);
	}

	@Override
	public List<Message> findAllMessageByHotelId(long hotelId) {
		// TODO Auto-generated method stub
		return this.messageDao.findAllMessageByHotelId(hotelId);
	}

	public MessageDao getMessageDao() {
		return messageDao;
	}

	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public RoomDao getRoomDao() {
		return roomDao;
	}

	public void setRoomDao(RoomDao roomDao) {
		this.roomDao = roomDao;
	}

	
}