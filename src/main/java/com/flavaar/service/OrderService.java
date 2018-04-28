package com.flavaar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavaar.dao.OrderDao;
import com.flavaar.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;

	public List<Order> getAllOrder() {
		return orderDao.getAllOrder();
	}
	
	public Order saveOrder(Order order) {
		return orderDao.saveOrder(order);
	}
	
}
