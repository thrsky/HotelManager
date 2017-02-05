package com.hotel.service.impl;

import java.sql.Timestamp;
import java.util.List;

import com.hotel.bean.Hotel;
import com.hotel.bean.Order;
import com.hotel.bean.Room;
import com.hotel.dao.OrderDao;
import com.hotel.dao.RoomDao;
import com.hotel.dao.WorkerDao;
import com.hotel.service.RoomService;

public class RoomServiceImpl implements RoomService{
	private OrderDao orderDao;
	private WorkerDao workerDao;
	public OrderDao getOrderDao() {
		return orderDao;
	}
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	private RoomDao roomDao;
	public RoomDao getRoomDao(){
		return roomDao;
	}
	public void setRoomDao (RoomDao roomDao){
		this.roomDao=roomDao;
	}
	

	@Override
	public void addRoom(Room room) {
		this.roomDao.addRoom(room);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Room> findAllRoom() {
		// TODO Auto-generated method stub
		return this.roomDao.findAllRoom();
	}

	@Override
	public void deleteRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.deleteRoom(room);
	}

	@Override
	public void updateRoom(Room room) {
		// TODO Auto-generated method stub
		this.roomDao.updateRoom(room);
		
	}

	@Override
	public Room findRoomById(Long roomId) {
		// TODO Auto-generated method stub
		return this.roomDao.findRoomById(roomId);
	}

	@Override
	public List<Room> findRoomByType(String status) {
		// TODO Auto-generated method stub
		return this.roomDao.findRoomByType(status);
	}
	@Override
	public List<Room> findFreeRoomByHotelIdAndTime(long hotelId,Timestamp orderInDate,Timestamp orderOutDate) {
		// TODO Auto-generated method stub
		//System.out.println("roomService");
		System.out.println("房间时间判断");
		List<Room> rooms = (List<Room>)this.roomDao.findRoomByHotelId(hotelId);
		int roomsize=rooms.size();
		for (int i=roomsize-1;i>=0;i--){
			Room room=rooms.get(i);
			if(room.getRoomStatus().equals("1")){
				
			}else if(room.getRoomStatus().equals("0")){
				long roomId=room.getRoomId();
				List<Order>  orders = (List<Order>)this.orderDao.findOrderByRoomId(roomId);
				if(orders.isEmpty()){
					rooms.remove(room);
					System.out.println("ɾ������"+roomId+"��Ϊ������û�и÷���");
				}else{
					int ordersize=orders.size();
					for(int j=ordersize-1;j>=0;j--){
						Order order = orders.get(j);
						String status=order.getOrderStatus();
						if(status.equals("待审核")||status.equals("进行中")){
							//
							if(order.getOrderInDate().before(orderOutDate)){
								//�÷��䲻�ܱ���Ԥ��
								rooms.remove(room);
								System.out.println("ɾ������"+roomId+"��Ϊʱ���ͻ");
							}
							else{
								if(order.getOrderOutDate().after(orderInDate)){
									rooms.remove(room);
									System.out.println("ɾ������"+roomId+"��Ϊʱ���ͻ");
								}
							}
						}
					}
				}
				
			}else{
				//异常房间
				rooms.remove(room);
				//System.out.println("ɾ������"+roomId+"��Ϊ������û�и÷���");
			}
		}
		return rooms;
						
	}
	@Override
	public boolean RoomIsFree(long roomId) {
		// TODO Auto-generated method stub
		return this.roomDao.RoomIsFree(roomId);
	}
	@Override
	public List<Room> findRoomByWorker(long workerId) {
		long hotelId=this.workerDao.findWorkerById(workerId).getHotel().getHotelId();
		return this.roomDao.findRoomByHotelId(hotelId);
		// TODO Auto-generated method
	}
	public WorkerDao getWorkerDao() {
		return workerDao;
	}
	public void setWorkerDao(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}

}
