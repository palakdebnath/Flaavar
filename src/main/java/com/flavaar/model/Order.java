package com.flavaar.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private String orderId;

	@ManyToOne
	@JoinColumn(table = "customer", referencedColumnName = "phoneNo")
	private Customer customer;
	
	private Date oderDate;
	
	@OneToOne
	@JoinColumn(table = "location", referencedColumnName = "locatioId")
	private Location location;
	
	private Boolean orderConfirmed;
	
	private Boolean orderDelivered;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getOderDate() {
		return oderDate;
	}

	public void setOderDate(Date oderDate) {
		this.oderDate = oderDate;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Boolean getOrderConfirmed() {
		return orderConfirmed;
	}

	public void setOrderConfirmed(Boolean orderConfirmed) {
		this.orderConfirmed = orderConfirmed;
	}

	public Boolean getOrderDelivered() {
		return orderDelivered;
	}

	public void setOrderDelivered(Boolean orderDelivered) {
		this.orderDelivered = orderDelivered;
	}
}
