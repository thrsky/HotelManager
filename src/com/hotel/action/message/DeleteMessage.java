package com.hotel.action.message;

import com.hotel.service.MessageService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteMessage extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long messageId;
	private MessageService messageService;
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public MessageService getMessageService() {
		return messageService;
	}
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	public String execute() throws Exception{
		
		try {
			this.messageService.deleteMessage(messageId);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
		
	}

}
