package com.customer.model;

import java.io.Serializable;

public class CustomerModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7772162759542754677L;

	private Integer id;

	private String name;

	private String address;

	public CustomerModel() {
		super();
	}

	public CustomerModel(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
