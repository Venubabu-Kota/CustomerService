package com.customer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.customer.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	@Query(value = "Select * from Customer where id = ?", nativeQuery = true)
	public Optional<Customer> findByCustomerId(Integer customerId);
	
}
