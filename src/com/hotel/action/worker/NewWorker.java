package com.hotel.action.worker;

import com.hotel.bean.Hotel;
import com.hotel.bean.Worker;
import com.hotel.service.HotelService;
import com.hotel.service.WorkerService;
import com.opensymphony.xwork2.ActionSupport;

public class NewWorker extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long hotelId;
	private String workerName;
	private WorkerService workerService;
	private HotelService hotelService;
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public WorkerService getWorkerService() {
		return workerService;
	}
	public void setWorkerService(WorkerService workerService) {
		this.workerService = workerService;
	}
	public HotelService getHotelService() {
		return hotelService;
	}
	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	public String execute() throws Exception{
		try {
			Hotel hotel = this.hotelService.findHotelById(hotelId);
			Worker worker = new Worker();
			worker.setHotel(hotel);
			worker.setWorkerName(workerName);
			worker.setWorkerPassword("123456");
			this.workerService.AddWorker(worker);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
}
