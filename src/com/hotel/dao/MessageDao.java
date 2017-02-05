package com.hotel.dao;

import java.util.List;

import com.hotel.bean.Message;

public interface MessageDao {
	public void addMessage(Message message);
	public void deleteMessage(long messageId);
	public Message findMessageById(long messageId);
	public List<Message> findAllMessageByHotelId(long hotelId);
}
