package gov.samhsa.ds4p.cms.consent.domain.core.value;

import java.io.Serializable;


public class EmailAddress implements Serializable {

	private static final long serialVersionUID = 8546099245827348158L;

	//@Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",message="Invalid email format.")
	private String emailAddress = null;

	public EmailAddress(String emailAdressStr) {
		emailAddress = emailAdressStr;
	}

	public String getEmailAddress() {
		return emailAddress;
	}	

}
