package com.demo.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.springboot.cruddemo.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
