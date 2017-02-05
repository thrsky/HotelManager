package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.bean.Message;
import com.hotel.dao.MessageDao;
@Transactional
public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao{


	@Override
	public void deleteMessage(long messageId) {
		Message mess=this.findMessageById(messageId);
		this.getHibernateTemplate().delete(mess);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMessage(Message message) {
		this.getHibernateTemplate().save(message);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Message findMessageById(long messageId) {
		// TODO Auto-generated method stub
		String hql="from Message message where message.messageId=?";
		return (Message) this.getHibernateTemplate().find(hql, messageId).get(0);
	}

	@Override
	public List<Message> findAllMessageByHotelId(long hotelId) {
		// TODO Auto-generated method stub
		String hql="from Message mess where mess.hotel.hotelId=?";
		return (List<Message>) this.getHibernateTemplate().find(hql, hotelId);
	}

}
