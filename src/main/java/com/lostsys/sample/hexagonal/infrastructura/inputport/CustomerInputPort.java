package com.lostsys.sample.hexagonal.infrastructura.inputport;

import java.util.List;

import com.lostsys.sample.hexagonal.dominio.Customer;

public interface CustomerInputPort {

    public Customer createCustomer(String name, String country);

    public Customer getById(String customerId);

    public List<Customer> getAll();
    
}
