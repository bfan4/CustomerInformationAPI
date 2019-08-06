package com.demo.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springboot.cruddemo.entity.Customer;
import com.demo.springboot.cruddemo.entity.Employee;
import com.demo.springboot.cruddemo.service.CustomerService;
import com.demo.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
    
    private CustomerService customerService;
    
    @Autowired
    public CustomerRestController(CustomerService theCustomerService) {
        customerService = theCustomerService;
    }
    
    @GetMapping("/customer")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    @GetMapping("/customer/{customerId}")
    public Customer getCustomer(@PathVariable int customerId) {
        
        Customer theCustomer  = customerService.findById(customerId);
        
        if(theCustomer == null) {
            throw new RuntimeException("Customer id not found - "+ customerId);
        }
        
        return theCustomer;
        
    }
    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer theCustomer) {
        
        theCustomer.setId(0);
        
        customerService.save(theCustomer);
        
        return theCustomer;        
    }
    
    @PutMapping("/customer")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {
        
        customerService.save(theCustomer);
        
        return theCustomer;
    }
    
    @DeleteMapping("/customer/{customerId}")
    public void deleteCustomer(@PathVariable int customerId) {
        
        customerService.deleteById(customerId);
        
    }

}
