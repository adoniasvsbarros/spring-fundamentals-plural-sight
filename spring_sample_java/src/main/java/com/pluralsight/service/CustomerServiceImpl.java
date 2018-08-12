package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
@Scope("singleton")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService
{
	
    private CustomerRepository customerRepository;

    /* 
    //constructor injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {
    	System.out.println("We are using constructor injection");
    	this.customerRepository = customerRepository;
    }
    */
    // setter injection
    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
    	System.out.println("We are using setter injection");
    	this.customerRepository = customerRepository;
	}

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
