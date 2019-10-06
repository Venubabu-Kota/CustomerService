package com.customer.service;

import java.util.List;

import com.customer.model.CustomerModel;

public interface CustomerService {

	public CustomerModel createCustomer(CustomerModel customerModel);

	public CustomerModel getCustomer(Integer customerId);

	public List<CustomerModel> getCustomerDetails();
}
