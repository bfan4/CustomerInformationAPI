package com.demo.springboot.cruddemo.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="Customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    
    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;
    
    @Column(name="email")
    private String email;
    
    @Column(name="address")
    private Address address;
    
    @Column(name="accountNumber")
    private String accountNumber;
    
    @Column(name="jobpid")
    private int jobpid;
    
    @Column(name="privoderpid")
    private int privoderpid;
    
    @Column(name="casepid")
    private int casepid;
    
    @Column(name="productpid")
    private String productpid;
  
    
    public Customer() {
        
    }

    @Autowired
    public Customer(int id, String firstName, String lastName, String email, Address address, String accountNumber,
            int jobpid, int privoderpid, int casepid, String productpid) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.accountNumber = accountNumber;
        this.jobpid = jobpid;
        this.privoderpid = privoderpid;
        this.casepid = casepid;
        this.productpid = productpid;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Address getAddress() {
        return address;
    }


    public void setAddress(Address address) {
        this.address = address;
    }


    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public int getJobpid() {
        return jobpid;
    }


    public void setJobpid(int jobpid) {
        this.jobpid = jobpid;
    }


    public int getPrivoderpid() {
        return privoderpid;
    }


    public void setPrivoderpid(int privoderpid) {
        this.privoderpid = privoderpid;
    }


    public int getCasepid() {
        return casepid;
    }


    public void setCasepid(int casepid) {
        this.casepid = casepid;
    }


    public String getProductpid() {
        return productpid;
    }


    public void setProductpid(String productpid) {
        this.productpid = productpid;
    }


    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
                + ", address=" + address + ", accountNumber=" + accountNumber + ", jobpid=" + jobpid + ", privoderpid="
                + privoderpid + ", casepid=" + casepid + ", products=" + productpid + "]";
    }
    
    

    
}

