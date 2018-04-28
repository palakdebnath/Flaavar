package com.flavaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavaar.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
