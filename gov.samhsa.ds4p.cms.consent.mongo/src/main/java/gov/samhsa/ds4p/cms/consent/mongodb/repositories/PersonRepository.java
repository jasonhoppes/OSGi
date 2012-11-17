package gov.samhsa.ds4p.cms.consent.mongodb.repositories;

import gov.samhsa.ds4p.cms.consent.mongodb.dto.Person;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long>, QueryDslPredicateExecutor<Person>{
	public Person findByEmailAddress(String email);	
}
