package com.flavaar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flavaar.model.Order;

public interface OrderRepository extends JpaRepository<Order, String> {

}
