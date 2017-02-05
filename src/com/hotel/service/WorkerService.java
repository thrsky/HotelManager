package com.hotel.service;

import java.util.List;

import com.hotel.bean.Worker;

public interface WorkerService {

	public Worker Login(String workerName,String workerPassword);
	public void updateWorker(Worker worker);
	public void deleteWorker(long workerId);
	public List<Worker> findWorkerByHotel(long hotelId);
	public Worker findWorkerById(long workerId);
	public void AddWorker(Worker worker);
}
