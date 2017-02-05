package com.hotel.dao;

import java.util.List;

import com.hotel.bean.Worker;

public interface WorkerDao {
	
	public Worker loginWorker(String workerName,String WorkerPassword);
	public void addWorker(Worker worker);
	public void deleteWorker(long workerId);
	public List<Worker> findAllWorker();
	public List<Worker> findWorkerByHotel(long hotelId);
	public void updateWorker(Worker worker);
	public Worker findWorkerById(Long workerId);
	public List<Worker> findWorkerByName(String workerName);
	
	

}
