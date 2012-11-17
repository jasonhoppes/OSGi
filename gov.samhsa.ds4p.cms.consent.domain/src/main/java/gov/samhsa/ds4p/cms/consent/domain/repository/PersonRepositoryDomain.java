package gov.samhsa.ds4p.cms.consent.domain.repository;

import gov.samhsa.ds4p.cms.consent.domain.Person;

public interface PersonRepositoryDomain extends Repository<Person>{
	public Person findByEmailAddress(String email);
	public void deleteAll();
	public void save(Person person);
}
