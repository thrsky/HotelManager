package com.hotel.service.impl;

import java.util.List;

import com.hotel.bean.Worker;
import com.hotel.dao.WorkerDao;
import com.hotel.service.WorkerService;

public class WorkerServiceImpl implements WorkerService{

	
	private WorkerDao workerDao;
	@Override
	public Worker Login(String workerName, String workerPassword) {
		// TODO Auto-generated method stub
		return this.workerDao.loginWorker(workerName, workerPassword);
	}

	@Override
	public void updateWorker(Worker worker) {
		// TODO Auto-generated method stub
		this.workerDao.updateWorker(worker);
	}

	@Override
	public void deleteWorker(long workerId) {
		// TODO Auto-generated method stub
		this.workerDao.deleteWorker(workerId);
	}

	@Override
	public List<Worker> findWorkerByHotel(long hotelId) {
		// TODO Auto-generated method stub
		return this.workerDao.findWorkerByHotel(hotelId);
	}

	@Override
	public Worker findWorkerById(long workerId) {
		
		// TODO Auto-generated method stub
		return this.workerDao.findWorkerById(workerId);
	}

	public WorkerDao getWorkerDao() {
		return workerDao;
	}

	public void setWorkerDao(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}

	@Override
	public void AddWorker(Worker worker) {
		// TODO Auto-generated method stub
		this.workerDao.addWorker(worker);
	}

}
