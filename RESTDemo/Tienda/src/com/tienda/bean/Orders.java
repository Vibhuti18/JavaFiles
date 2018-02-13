package com.tienda.bean;


import java.util.Date;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="order")
public class Orders {

	private int orderId;
	private String orderNumber;
	private Date orderDate;
	private User orderedBy;
	private Set<Product> cart;
	private orderStatus status;

	public Orders() {
		// TODO Auto-generated constructor stub
	}

	public Orders(int orderId, String orderNumber, Date orderDate, User orderedBy,
			orderStatus status, Set<Product> cart) {
		this.orderId = orderId;
		this.orderNumber = orderNumber;
		this.orderDate = orderDate;
		this.orderedBy = orderedBy;
		this.cart = cart;
		this.status = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public User getOrderedBy() {
		return orderedBy;
	}

	public void setOrderedBy(User orderedBy) {
		this.orderedBy = orderedBy;
	}

	public Set<Product> getCart() {
		return cart;
	}

	public void setCart(Set<Product> cart) {
		this.cart = cart;
	}

	public orderStatus getStatus() {
		return status;
	}

	public void setStatus(orderStatus status) {
		this.status = status;
	}

}
