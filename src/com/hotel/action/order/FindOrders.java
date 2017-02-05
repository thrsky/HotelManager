package com.hotel.action.order;

import java.util.List;
import java.util.Map;

import com.hotel.bean.Order;
import com.hotel.bean.User;
import com.hotel.service.OrderService;
import com.hotel.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindOrders extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;
	private long workerId;
	private OrderService orderService;
	private UserService userService;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public OrderService getOrderService() {
		return orderService;
	}
	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}
	
	public String ByUserId() throws Exception{
		System.out.println("1");
		try {
			Map request = (Map) ActionContext.getContext().get("request");
			request.put("orderlistbyuserid", this.orderService.findOrdersByUserId(userId));
			//System.out.println(this.orderService.findOrdersByUserId(userId).get(0).getRoomByRoomId().getHotel().getHotelCity());
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	
	public String ByWorkerId() throws Exception{
		try {
			System.out.println("workerId is "+workerId);
			Map request = (Map) ActionContext.getContext().get("request");
			List<Order> allorderlist;
			List<Order> daishenhelist;
			allorderlist=this.orderService.findOrdersByWorker(workerId);
			daishenhelist=this.orderService.findOrdersByWorker(workerId);
			request.put("allorderlist", allorderlist);
			int size=allorderlist.size();
			for (int i=size-1;i>=0;i--){
				Order order = allorderlist.get(i);
				System.out.println("现在orderId是"+order.getOrderId()+"get(i)是"+i);
				if(order.getOrderStatus().equals("待审核")){
				}else{					
					daishenhelist.remove(i);
				}
			}
			request.put("daishenhelist", daishenhelist);

			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return INPUT;
		}
	}
	public long getWorkerId() {
		return workerId;
	}
	public void setWorkerId(long workerId) {
		this.workerId = workerId;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}
