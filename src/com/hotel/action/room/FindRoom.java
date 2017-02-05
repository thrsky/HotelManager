package com.hotel.action.room;

import java.util.Map;

import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindRoom extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long workerId;
	private RoomService roomService;
	public long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	public String findByWorker() throws  Exception{
		
		try {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("allroomlist", this.roomService.findRoomByWorker(workerId));
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
}
