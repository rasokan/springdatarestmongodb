package com.learn.spring.datarest.mongodb.repository;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;

import com.learn.spring.datarest.mongodb.domain.Address;

/**
 * @author ASHOK Jul 28, 2013
 */

@EnableMongoRepositories
public interface AddressRepository extends CrudRepository<Address, String> {

}
