package com.learn.spring.datarest.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author ASHOK Jul 28, 2013
 */

@Document
public class Person {

	private static final long serialVersionUID = 1L;

	private String username;

	private String firstName;

	private String lastName;

	@Id
	private String id;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	/*public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
*/
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
/*	@DBRef
	private Address address;*/
	
	public Person(){
		
	}

}
