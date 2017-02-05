package com.hotel.action.worker;

import java.util.Map;

import com.hotel.bean.Worker;
import com.hotel.service.WorkerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class WorkerLoginAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long workerId;
	private String workerName;
	private String workerPassword;
	private WorkerService workerService;
	public String getWorkerName() {
		return workerName;
	}
	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}
	public String getWorkerPassword() {
		return workerPassword;
	}
	public void setWorkerPassword(String workerPassword) {
		this.workerPassword = workerPassword;
	}
	
	public String execute() throws Exception{
		try {
			
			Worker worker = this.workerService.Login(workerName, workerPassword);
			Map session = (Map) ActionContext.getContext().getSession();
			session.put("worker", worker);
			workerId=worker.getWorkerId();
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	public WorkerService getWorkerService() {
		return workerService;
	}
	public void setWorkerService(WorkerService workerService) {
		this.workerService = workerService;
	}
	public long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}

}
