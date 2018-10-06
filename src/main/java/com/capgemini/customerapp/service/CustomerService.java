package com.capgemini.customerapp.service;

import java.util.List;

import com.capgemini.customerapp.entity.Customer;
import com.capgemini.customerapp.exception.AuthenticationFailedException;
import com.capgemini.customerapp.exception.CustomerNotFoundException;

public interface CustomerService {
	public Customer addCustomer(Customer customer);

	public Customer authentication(Customer customer) throws CustomerNotFoundException, AuthenticationFailedException;

	public Customer getCustomerById(int customerId) throws CustomerNotFoundException;

	public Customer getCustomerByEmail(String customerEmail) throws CustomerNotFoundException;

	public List<Customer> getAllCustomers();

	public void deleteCustomer(Customer customer) throws CustomerNotFoundException;

	public Customer editCustomer(Customer customer) throws CustomerNotFoundException;
}
