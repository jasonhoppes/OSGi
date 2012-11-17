package gov.samhsa.ds4p.cms.consent.persist.repository;


import gov.samhsa.ds4p.cms.consent.domain.Person;
import gov.samhsa.ds4p.cms.consent.domain.repository.PersonRepositoryDomain;
import gov.samhsa.ds4p.cms.consent.mongodb.repositories.PersonRepository;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("peronDomainRepository")
public class PersonRepositoryImpl implements PersonRepositoryDomain {
	
	@Autowired private PersonRepository personRepository;
	@Autowired private Mapper dozerMapper;

	private static final long serialVersionUID = -7073970226723417059L;

	public PersonRepositoryImpl() {}

	@Override
	public Person findByEmailAddress(String email) {
		gov.samhsa.ds4p.cms.consent.mongodb.dto.Person person = personRepository.findByEmailAddress(email);
		return dozerMapper.map(person, Person.class);
	}

	@Override
	public Person findById(String id) {
		return (Person)null;
	}

	@Override
	public void deleteAll() {
		personRepository.deleteAll();
		
	}

	@Override
	public void save(Person p) {
		gov.samhsa.ds4p.cms.consent.mongodb.dto.Person person = dozerMapper.map(p, gov.samhsa.ds4p.cms.consent.mongodb.dto.Person.class);
		personRepository.save(person);
		
	}


}
