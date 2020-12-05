/**
* @author Ramanpreet Singh
*/
package com.crm.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.springdemo.dao.CustomerDAO;
import com.crm.springdemo.entity.Customer;

/* Class containing the required business logic */
/* @Transactional - any failure causes the entire operation to roll back to its previous state 
and to re-throw the original exception. */
@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	/**
	* @return list of customers
	*/
	@Override
	@Transactional 
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}
	/**
	* @param theCustomer
	* Method saves the customer entry in the repository
	*/
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}
	/**
	* @return Customer
	* @param id
	* Method returns the particular customer based on provided id
	*/
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}
	/**
	* @param theId
	* Method deletes the customer in the repository for the given id
	*/
	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		customerDAO.deleteCustomer(theId);
	}
}





