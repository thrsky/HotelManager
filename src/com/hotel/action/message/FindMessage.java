package com.hotel.action.message;

import java.util.Map;

import com.hotel.service.MessageService;
import com.hotel.service.WorkerService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindMessage extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long workerId;
	private long hotelId;
	private MessageService messageService;
	private WorkerService workerService;
	public long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	
	public String findByHotel() throws Exception{
		
		try {
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("messagelistinAdmin", this.messageService.findAllMessageByHotelId(getHotelId()));
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	public String findByWorker() throws Exception{
		
		try {
			long hotelId = this.workerService.findWorkerById(workerId).getHotel().getHotelId();
			Map request=(Map) ActionContext.getContext().get("request");
			request.put("messagelist", this.messageService.findAllMessageByHotelId(hotelId));
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
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
}
