package com.hotel.service;

import java.util.List;

import com.hotel.bean.Message;

public interface MessageService {
	public void addMessage(long userId,long hotelId,String messageValue);
	public void deleteMessage(long messageId);
	public Message findMessageById(long messageId);
	public List<Message> findAllMessageByHotelId(long hotelId);

}
