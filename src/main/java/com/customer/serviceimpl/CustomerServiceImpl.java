package com.customer.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.entity.Customer;
import com.customer.model.CustomerModel;
import com.customer.repository.CustomerRepository;
import com.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerModel createCustomer(CustomerModel customerModel) {

		Customer customerEntity = new Customer();
		customerEntity.setId(customerModel.getId());
		customerEntity.setName(customerModel.getName());
		customerEntity.setAddress(customerModel.getAddress());
		Customer customer = customerRepository.save(customerEntity);
		return new CustomerModel(customer.getId(), customer.getName(), customer.getAddress());
	}

	@Override
	public CustomerModel getCustomer(Integer customerId) {

		Customer customer = customerRepository.findById(customerId).get();

		return new CustomerModel(customer.getId(), customer.getName(), customer.getAddress());
	}

	@Override
	public List<CustomerModel> getCustomerDetails() {

		List<CustomerModel> customerList = new ArrayList<CustomerModel>();
		List<Customer> customers = customerRepository.findAll();
		for (Customer customer : customers) {

			customerList.add(new CustomerModel(customer.getId(), customer.getName(), customer.getAddress()));

		}

		return customerList;
	}

}
