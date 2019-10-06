package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.CustomerModel;
import com.customer.service.CustomerService;

@RestController
@RequestMapping(value = "/api/")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping(value = "customer")
	public CustomerModel getCustomers(@RequestBody CustomerModel customerModel) {

		return customerService.createCustomer(customerModel);
	}

	@GetMapping(value = "customer/{id}")
	public CustomerModel getCustomers(@PathVariable("id") Integer customerId) {

		return customerService.getCustomer(customerId);
	}

	@GetMapping(value = "customers")
	public List<CustomerModel> getCustomers() {

		return customerService.getCustomerDetails();
	}
}
