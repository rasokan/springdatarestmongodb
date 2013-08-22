package com.learn.spring.datarest.mongodb.repository;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.learn.spring.datarest.mongodb.domain.Person;

/**
 * @author ASHOK Jul 28, 2013
 */

@EnableMongoRepositories
public interface PersonRepository extends CrudRepository<Person, String> {

	Person findByUsername(@Param("username") String username);

}
