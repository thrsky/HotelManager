package com.hotel.action.room;

import com.hotel.bean.Hotel;
import com.hotel.bean.Room;
import com.hotel.service.RoomService;
import com.hotel.service.WorkerService;
import com.opensymphony.xwork2.ActionSupport;

public class AddRoom extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long workerId;
	private String roomType;
	private double roomSize;
	private int roomFllor;
	private int roomNumber;
	private double roomPrice;
	private String roomInfo;
	private int roomBedNum;
	private RoomService roomService;
	private WorkerService workerService;
	public long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRoomSize() {
		return roomSize;
	}
	public void setRoomSize(double roomSize) {
		this.roomSize = roomSize;
	}
	public int getRoomFllor() {
		return roomFllor;
	}
	public void setRoomFllor(int roomFllor) {
		this.roomFllor = roomFllor;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getRoomInfo() {
		return roomInfo;
	}
	public void setRoomInfo(String roomInfo) {
		this.roomInfo = roomInfo;
	}
	public int getRoomBedNum() {
		return roomBedNum;
	}
	public void setRoomBedNum(int roomBedNum) {
		this.roomBedNum = roomBedNum;
	}
	public RoomService getRoomService() {
		return roomService;
	}
	public void setRoomService(RoomService roomService) {
		this.roomService = roomService;
	}
	
	
	public String execute() throws Exception{
		try {
			Room room = new Room();
			long roomId=this.roomService.findAllRoom().size()+2;
			room.setRoomId(roomId);
			room.setRoomNumber(roomNumber);
			room.setRoomPrice(roomPrice);
			room.setRoomSize(roomSize);
			room.setRoomType(roomType);
			room.setRoomInfo(roomInfo);
			room.setRoomBedNum(roomBedNum);
			room.setRoomStatus("1");
			roomFllor = roomNumber/100;
			room.setRoomFllor(roomFllor);
			System.out.println(workerId);
			Hotel hotel=this.workerService.findWorkerById(workerId).getHotel();
			//System.out.println(hotel.getHotelId());
			//能获取hotel对象
			room.setHotel(hotel);
			this.roomService.addRoom(room);
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
}
