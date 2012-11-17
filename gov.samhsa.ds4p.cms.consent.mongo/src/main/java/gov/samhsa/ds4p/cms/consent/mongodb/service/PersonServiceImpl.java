/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.samhsa.ds4p.cms.consent.mongodb.service;


import gov.samhsa.ds4p.cms.consent.mongodb.dto.Person;
import gov.samhsa.ds4p.cms.consent.mongodb.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ben.neuman
 */
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person findById(Long id) {
        return personRepository.findOne(id);
    }

    @Override
    public Person save(Person person) {
        return personRepository.save(person);
    }

    @Override
    public Person findByEmailAddress(String email) {
        return personRepository.findByEmailAddress(email);
    }
}
