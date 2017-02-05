package com.hotel.dao.impl;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.bean.User;
import com.hotel.dao.UserDao;

/*
 * ����  dao ��ʵ��
 * thrsky
 * 2016/12/8
 *
 */
@Transactional
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	//ע���û�
	
	@Override
	public boolean addUser(User user) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
			this.getHibernateTemplate().save(user);
			return true;
		}catch (Exception e){
			return false;
		}
		
	}
	
	//�����û���Ϣ
	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().update(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}

	//ɾ���û�
	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		try{
			this.getHibernateTemplate().delete(user);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	//���������û�
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		String hql="from User user order by user.userId DESC";
		return (List<User>)this.getHibernateTemplate().find(hql);
	}

	//�����û�
	@Override
	public List<User> findUser(String value) {
		// TODO Auto-generated method stub
		String hql="from User user where user.userName like ? or user.userId = ?";
		
		return (List<User>)this.getHibernateTemplate().find(hql,new String[]{"%"+value+"%",value});
	}

	//�û���¼
	@Override
	public User loginUser(String userName,String userPassword) {
		System.out.println(userName+","+userPassword);
		String hql="from User user where user.userName=? and user.userPassword=?";
		List<User> list=(List<User>) this.getHibernateTemplate().find(hql,new String[]{userName,userPassword});
		if(list.size()>0){
			System.out.println("one user");
			return list.get(0);
		}else{
			System.out.println("no user");
			return null;
		}
		
	}

	@Override
	public User findUserById(long value) {
		// TODO Auto-generated method stub
		String hql="from User user where user.userId=?";
		return (User) this.getHibernateTemplate().find(hql, value).get(0);
	}

	@Override
	public boolean chcekUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User findUserByPhone(String phone) {
		// TODO Auto-generated method stub
		String hql="from User user where user.userPhone=?";
		
		return (User) this.getHibernateTemplate().find(hql, phone).get(0);
	}

}
