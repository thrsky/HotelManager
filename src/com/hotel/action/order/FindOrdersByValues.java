package com.hotel.action.order;

import java.util.Map;

import com.hotel.service.OrderService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindOrdersByValues extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String userPhone;
	private String userIdnumber;
	private OrderService orderService;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserIdnumber() {
		return userIdnumber;
	}
	public void setUserIdnumber(String userIdnumber) {
		this.userIdnumber = userIdnumber;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public String execute() throws Exception{
		try{
			Map request = (Map) ActionContext.getContext().get("request");
			//下面的代码没错！  可能你看不懂    但是自有深意
			if(userName.isEmpty()){
				userName="sdkfhw的实例看到是的呢";
			}
			if(userPhone.isEmpty()){
				userPhone="eeJd时代大厦但是";
			}
			if(userIdnumber.isEmpty()){
				userIdnumber="ds#jsdbs但是订单是的的是的是";
			}
			request.put("orderlist", this.orderService.findOrderByValues(userName, userPhone, userIdnumber));
			return SUCCESS;
		}catch (Exception e){
			return INPUT;
		}
	}

}
