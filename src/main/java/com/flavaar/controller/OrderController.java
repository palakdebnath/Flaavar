package com.flavaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flavaar.model.Order;
import com.flavaar.service.OrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Order> getAllOrders() {
		return orderService.getAllOrder();
	}

}
