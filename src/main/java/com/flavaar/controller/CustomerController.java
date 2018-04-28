package com.flavaar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flavaar.model.Customer;
import com.flavaar.service.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/all",  method=RequestMethod.GET)
	public List<Customer> getAllCustomer() {
		return customerService.getAllCustomer();
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public Customer saveLocation(@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
}
