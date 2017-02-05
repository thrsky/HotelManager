package com.hotel.action.worker;

import com.hotel.service.WorkerService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteWorker extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long workerId;
	private WorkerService workerService;
	public long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}
	public WorkerService getWorkerService() {
		return workerService;
	}
	public void setWorkerService(WorkerService workerService) {
		this.workerService = workerService;
	}
	
	public String execute() throws Exception{
		
		try {
			this.workerService.deleteWorker(workerId);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

}
