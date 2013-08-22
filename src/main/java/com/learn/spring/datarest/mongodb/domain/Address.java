package com.learn.spring.datarest.mongodb.domain;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ASHOK
 * Jul 28, 2013
 */

@Document
public class Address{

	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private Long zipCode;
	
	private String country;
	
	private String state;

	public Long getZipCode() {
		return zipCode;
	}

	public void setZipCode(Long zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public Address()	{
		
	}
}


