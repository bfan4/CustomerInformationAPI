package com.demo.springboot.cruddemo.service;

import java.util.List;

import com.demo.springboot.cruddemo.entity.Customer;


public interface CustomerService {
    
    public List<Customer> findAll();
    
    public Customer findById(int theId);
    
    public void save(Customer theCustomer);
    
    public void deleteById(int theId);
    

}
