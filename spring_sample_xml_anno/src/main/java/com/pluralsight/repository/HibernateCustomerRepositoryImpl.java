package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

//repository tear

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository
{
    /*
     * (non-Javadoc)
     * @see com.pluralsight.repository.CustomerRepository#findAll()
     */
    @Override
    public List<Customer> findAll()
    {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Adonias");
        customer.setLastname("Barros");

        customers.add(customer);
        return customers;
    }
}
