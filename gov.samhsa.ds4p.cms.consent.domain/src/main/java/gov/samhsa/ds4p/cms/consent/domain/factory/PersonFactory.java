package gov.samhsa.ds4p.cms.consent.domain.factory;

import gov.samhsa.ds4p.cms.consent.domain.Person;
import gov.samhsa.ds4p.cms.consent.domain.core.value.Address;
import gov.samhsa.ds4p.cms.consent.domain.core.value.Name;

import java.awt.Image;
import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("personFactory")
public class PersonFactory implements Serializable {
	
	private static final long serialVersionUID = -7265047153899516223L;

	private PersonFactory() {}
	
	public Person create(Address billingAddress, Image image, Name name, String dobStr,
			String homePhoneStr, String cellPhoneStr, Address homeAddress){		
		return new Person(billingAddress, image, name, dobStr, homePhoneStr, cellPhoneStr, homeAddress);
	}	

}
