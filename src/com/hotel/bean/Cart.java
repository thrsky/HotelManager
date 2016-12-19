package com.hotel.bean;

/**
 * Cart entity. @author MyEclipse Persistence Tools
 */

public class Cart implements java.io.Serializable {

	// Fields

	private Long cartId;
	private Order orders;
	private User user;
	private Long orderId;
	private Integer orderNum;
	private Double cartPrice;

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** full constructor */
	public Cart(Long cartId, Order orders, User user, Long orderId, Integer orderNum, Double cartPrice) {
		this.cartId = cartId;
		this.orders = orders;
		this.user = user;
		this.orderId = orderId;
		this.orderNum = orderNum;
		this.cartPrice = cartPrice;
	}

	// Property accessors

	public Long getCartId() {
		return this.cartId;
	}

	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}

	public Order getOrders() {
		return this.orders;
	}

	public void setOrders(Order orders) {
		this.orders = orders;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	public Double getCartPrice() {
		return this.cartPrice;
	}

	public void setCartPrice(Double cartPrice) {
		this.cartPrice = cartPrice;
	}

}