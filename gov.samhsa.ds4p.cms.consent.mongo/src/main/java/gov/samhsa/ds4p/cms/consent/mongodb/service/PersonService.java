/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.samhsa.ds4p.cms.consent.mongodb.service;

import gov.samhsa.ds4p.cms.consent.mongodb.dto.Person;


/**
 *
 * @author ben.neuman
 */
public interface PersonService {

    public Person findById(Long id);

    public Person save(Person person);
    
    public Person findByEmailAddress(String email);
}
