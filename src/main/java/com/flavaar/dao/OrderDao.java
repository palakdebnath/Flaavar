package com.flavaar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavaar.model.Order;
import com.flavaar.repository.OrderRepository;

@Service
public class OrderDao {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> getAllOrder() {
		return orderRepository.findAll();
	}
	
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
	
}
