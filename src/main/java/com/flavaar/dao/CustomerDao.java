package com.flavaar.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavaar.model.Customer;
import com.flavaar.repository.CustomerRepository;

@Service
public class CustomerDao {

		@Autowired
		private CustomerRepository customerRepository;
		
		public List<Customer> getAllCustomer() {
			return customerRepository.findAll();
		}
		
		public Customer saveCustomer(Customer customer) {
			return customerRepository.save(customer);
		}
		
}
