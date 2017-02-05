package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.bean.Worker;
import com.hotel.dao.WorkerDao;
@Transactional
public class WorkerDaoImpl extends HibernateDaoSupport implements WorkerDao{

	@Override
	public Worker loginWorker(String workerName, String WorkerPassword) {
		// TODO Auto-generated method stub
		System.out.println(workerName+","+WorkerPassword);
		String hql="from Worker worker where worker.workerName=? and worker.workerPassword=?";
		List<Worker> list= (List<Worker>) this.getHibernateTemplate().find(hql, new String[]{workerName,WorkerPassword});
		if(list.size()>0){
			System.out.println("one worker");
			return list.get(0);
		}else{
			System.out.println("no worker");
			return null;
		}
	}

	@Override
	public void addWorker(Worker worker) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(worker);
		
	}

	@Override
	public void deleteWorker(long workerId) {
		Worker worker;
		String hql="from Worker worker where worker.workerId=?";
		worker = (Worker) getHibernateTemplate().find(hql,workerId).get(0);
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(worker);
	}

	@Override
	public List<Worker> findAllWorker() {
		String hql="from Worker worker order by worker.workerId=?";
		// TODO Auto-generated method stub
		return (List<Worker>) this.getHibernateTemplate().find(hql);
	}

	@Override
	public void updateWorker(Worker worker) {
		this.getHibernateTemplate().update(worker);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Worker findWorkerById(Long workerId) {
		// TODO Auto-generated method stub
		//System.out.println("search for worker id is "+workerId);
		String hql="from Worker worker where worker.workerId=?";
		return (Worker) this.getHibernateTemplate().find(hql, workerId).get(0);
	}

	@Override
	public List<Worker> findWorkerByName(String workerName) {
		// TODO Auto-generated method stub
		String hql="from Worker worker where worker.workerName like ?";
		return (List<Worker>) this.getHibernateTemplate().find(hql, "%"+workerName+"%");
	}

	@Override
	public List<Worker> findWorkerByHotel(long hotelId) {
		// TODO Auto-generated method stub
		String hql="from Worker w where w.hotel.hotelId=?";
		return (List<Worker>) this.getHibernateTemplate().find(hql, hotelId);
	}

}
