package com.learn.spring.datarest.mongodb.util;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.learn.spring.datarest.mongodb.domain.Address;
import com.learn.spring.datarest.mongodb.domain.Person;

/**
 * @author ASHOK Jul 28, 2013
 */
public class InitMongoService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void init() {

		mongoTemplate.dropCollection("person");
		mongoTemplate.dropCollection("address");

		Address address = new Address();

		address.setCountry("USA");
		address.setState("Michigan");
		address.setZipCode(123456L);
		address.setId(UUID.randomUUID().toString());

		Person person = new Person();
		person.setId(UUID.randomUUID().toString());
		person.setFirstName("Ashy");
		person.setLastName("Judd");
		person.setUsername("ashy");
		//person.setAddress(address);

		Address address1 = new Address();

		address1.setCountry("USA");
		address1.setState("Texas");
		address1.setZipCode(48266L);
		address1.setId(UUID.randomUUID().toString());

		Person person1 = new Person();
		person1.setId(UUID.randomUUID().toString());
		person1.setFirstName("Halle");
		person1.setLastName("Jack");
		person1.setUsername("halle");
		//person1.setAddress(address1);

		mongoTemplate.insert(address);
		mongoTemplate.insert(address1);
		mongoTemplate.insert(person);
		mongoTemplate.insert(person1);

	}

}
