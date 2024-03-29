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

import com.demo.springboot.cruddemo.entity.Employee;
import com.demo.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    
    private EmployeeService employeeService;
    
    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;
    }
    
    @GetMapping("/employee")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping("/employee/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId) {
        
        Employee theEmployee  = employeeService.findById(employeeId);
        
        if(theEmployee == null) {
            throw new RuntimeException("Employee id not found - "+ employeeId);
        }
        
        return theEmployee;
        
    }
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee) {
        
        theEmployee.setId(0);
        
        employeeService.save(theEmployee);
        
        return theEmployee;        
    }
    
    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {
        
        employeeService.save(theEmployee);
        
        return theEmployee;
    }
    
    @DeleteMapping("/employee/{employeeId}")
    public void deleteEmployee(@PathVariable int employeeId) {
        
        employeeService.deleteById(employeeId);
        
    }

}
