package gov.samhsa.ds4p.cms.consent.mongodb.test;


import static org.junit.Assert.assertEquals;
import gov.samhsa.ds4p.cms.consent.domain.Person;
import gov.samhsa.ds4p.cms.consent.domain.core.value.Address;
import gov.samhsa.ds4p.cms.consent.domain.core.value.Name;
import gov.samhsa.ds4p.cms.consent.domain.factory.PersonFactory;
import gov.samhsa.ds4p.cms.consent.domain.repository.PersonRepositoryDomain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Ben.Neuman
 */
@ContextConfiguration(classes = MongoApplicationConfig.class)
public class PersonRepositoryIntegrationTest extends AbstractMongoIntegrationTest {

    @Autowired private PersonRepositoryDomain personDomainRepository;    
    @Autowired private PersonFactory personFactory; 

    @Test
    public void createProduct() {

        personDomainRepository.deleteAll();
        Person person = personFactory.create(createAddress("Bill City"), null, new Name("Herman", "", "Munster", "Mr.", ""), "08081908", "5703251313", "5703250000", createAddress("Homecity"));
        personDomainRepository.save(person);
        
        Person found = personDomainRepository.findByEmailAddress("Test");
        assertEquals("Test", found.getEmailAddress());
        
    }
    
    private Address createAddress(String city){
    	return new Address("1313 Mockingbird LN", null, city, "NH", "12345", null);
    }
}