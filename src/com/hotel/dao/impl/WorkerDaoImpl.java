package com.hotel.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.hotel.bean.Worker;
import com.hotel.dao.WorkerDao;

public class WorkerDaoImpl extends HibernateDaoSupport implements WorkerDao{

	@Override
	public Worker loginWorker(String workerName, String WorkerPassword) {
		// TODO Auto-generated method stub
		String hql="from Worker worker where worker,workerName=? and worker.workerPassword=?";
		return (Worker) this.getHibernateTemplate().find(hql, new String[]{workerName,WorkerPassword});
	}

	@Override
	public void addWorker(Worker worker) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(worker);
		
	}

	@Override
	public void deleteWorker(long workerId) {
		Worker worker;
		String hql="from Wroker worker where worker.workerId=?";
		worker = (Worker) getHibernateTemplate().find(hql,workerId);
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
		String hql="from Worker worker where worker.workeId=?";
		return (Worker) this.getHibernateTemplate().find(hql, workerId);
	}

	@Override
	public List<Worker> findWorkerByName(String workerName) {
		// TODO Auto-generated method stub
		String hql="from Worker worker where worker.workerName like ?";
		return (List<Worker>) this.getHibernateTemplate().find(hql, "%"+workerName+"%");
	}

}
