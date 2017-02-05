package com.hotel.action.worker;

import java.util.Map;

import com.hotel.service.WorkerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindWorkers extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long hotelId;
	private WorkerService workerService;
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public WorkerService getWorkerService() {
		return workerService;
	}
	public void setWorkerService(WorkerService workerService) {
		this.workerService = workerService;
	}
	
	public String execute() throws Exception{
		
		try {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("workerList", this.workerService.findWorkerByHotel(hotelId));
			request.put("hotelId", hotelId);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

}
