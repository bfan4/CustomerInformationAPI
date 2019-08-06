package com.demo.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springboot.cruddemo.dao.CustomerRepository;
import com.demo.springboot.cruddemo.dao.EmployeeRepository;
import com.demo.springboot.cruddemo.entity.Customer;
import com.demo.springboot.cruddemo.entity.Employee;

@Service
public class CustomerServiceImpl implements CustomerService {

    
    private CustomerRepository customerRepository;
    
    @Autowired
    public CustomerServiceImpl(CustomerRepository theCustomerRepository) {
        customerRepository = theCustomerRepository;
    }
    
    @Override
    public List<Customer> findAll() {
        
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(int theId) {
        
        Optional<Customer> result = customerRepository.findById(theId);
        
        Customer theCustomer = null;
        
        if (result.isPresent()) {
            theCustomer = result.get();
        }
        else {
            throw new RuntimeException("Did not find Customer Id - " + theId);
        }
        return theCustomer;
    }

    @Override
    public void save(Customer theCustomer) {
        
        customerRepository.save(theCustomer);

    }

    @Override
    public void deleteById(int theId) {
        
        customerRepository.deleteById(theId);

    }


}

