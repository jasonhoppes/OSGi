/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.samhsa.ds4p.cms.consent.mongodb.repositories;

import gov.samhsa.ds4p.cms.consent.mongodb.xacml.Policy;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ben.Neuman
 */
public interface PolicyRepository extends CrudRepository<Policy, String>, QueryDslPredicateExecutor<Policy> {
    
    Policy findByDescription(String desc);
    Policy findByDescriptionContaining(String description);
        
}
