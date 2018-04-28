package com.flavaar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavaar.dao.CustomerDao;
import com.flavaar.model.Customer;

@Service
public class CustomerService {

		@Autowired
		private CustomerDao customerDao;
		
		public List<Customer> getAllCustomer() {
			return customerDao.getAllCustomer();
		}
		
		public Customer saveCustomer(Customer customer) {
			return customerDao.saveCustomer(customer);
		}
}
