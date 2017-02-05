package com.hotel.action.room;

import com.hotel.bean.Room;
import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeRoom extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long roomId;
	private long workerId;
	private RoomService roomService;
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
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
	
	public String close() throws Exception{
		
		try {
			Room room=this.roomService.findRoomById(roomId);
			room.setRoomStatus("2");
			this.roomService.updateRoom(room);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	
public String open() throws Exception{
		
		try {
			Room room=this.roomService.findRoomById(roomId);
			room.setRoomStatus("1");
			this.roomService.updateRoom(room);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
}
