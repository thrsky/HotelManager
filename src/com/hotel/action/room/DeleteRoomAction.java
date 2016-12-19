package com.hotel.action.room;

import com.hotel.bean.Room;
import com.hotel.service.RoomService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class DeleteRoomAction extends ActionSupport{
	
	private Room room;
	private RoomService roomService;
	public Room getRoom(){
		return room;
	}
	public void setRoom(Room room){
		this.room=room;
	}
	public void setRoomService(RoomService roomService){
		this.roomService=roomService;
	}
	public RoomService getRoomService(){
		return roomService;
	}
	
	@Override
	public String execute() throws Exception {
		this.roomService.deleteRoom(room);

		return SUCCESS;
	}

}
