package com.hotel.action.message;
import com.hotel.dao.MessageDao;
import com.hotel.service.MessageService;
import com.opensymphony.xwork2.ActionSupport;
public class FindMessageByHotelId extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long hotelId;
	private long userId;
	private long roomId;
	private String messageValue;
	private MessageService messageService;
	public long getHotelId() {
		return hotelId;
	}
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getMessageValue() {
		return messageValue;
	}
	public void setMessageValue(String messageValue) {
		this.messageValue = messageValue;
	}
	
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public String execute() throws Exception{
		try {
			this.messageService.addMessage(userId, roomId, messageValue);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}

}
