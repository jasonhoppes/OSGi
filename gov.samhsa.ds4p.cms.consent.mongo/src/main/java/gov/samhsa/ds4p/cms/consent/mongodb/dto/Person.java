package gov.samhsa.ds4p.cms.consent.mongodb.dto;


import gov.samhsa.ds4p.cms.consent.domain.core.value.Address;
import gov.samhsa.ds4p.cms.consent.domain.core.value.EmailAddress;
import gov.samhsa.ds4p.cms.consent.domain.core.value.Name;
import gov.samhsa.ds4p.cms.consent.domain.core.value.ValueCreationException;
import gov.samhsa.ds4p.cms.consent.mongodb.AbstractDocument;

import java.awt.Image;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.dozer.Mapping;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

@Document
public class Person extends AbstractDocument implements Serializable {

	final String DATE_FORMAT = "MMddyyyy";

	private static final long serialVersionUID = -7713341304951870950L;
	@Mapping("name")
	private Name name;
	
	@Mapping("image")
	private Image image;
	
	@Mapping("homePhone")
	@Field("homePhone")
	private PhoneNumber homePhone = new PhoneNumber();
	
	@Mapping("cellPhone")
	@Field("cellPhone")
	private PhoneNumber cellPhone = new PhoneNumber();
	
	@Mapping("dob")
	@Field("dateOfBirth")
	private Date dob = null;
	
	@Mapping("homeAddress")
	@Field("homeAddress")
	private Address homeAddress = null;
	
	@Mapping("billingAddres")
	@Field("billingAddress")
	private Address billingAddress = null;
	
	@Mapping("emailAddress")
	@Field("emailAddres")
	private EmailAddress emailAddress;

	public Address getHomeAddress() {
		return homeAddress;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public EmailAddress getEmailAddress() {
		return emailAddress;
	}

	public void setHomePhone(PhoneNumber homePhone) {
		this.homePhone = homePhone;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public void setEmailAddress(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Image getImage() {
		return image;
	}

	public String getHomePhone() {
		return PhoneNumberUtil.getInstance().formatInOriginalFormat(homePhone,
				null);
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone.setRawInput(homePhone);
	}

	public String getFirst() {
		return name.getFirst();
	}

	public String getMiddle() {
		return name.getMiddle();

	}

	public String getLast() {
		return name.getLast();
	}

	public String getPrefix() {
		return name.getPrefix();
	}

	public String getSuffix() {
		return name.getSuffix();
	}

	public String getMiddleInitial() {
		return name.getMiddleInitial();
	}

	public String getCellPhone() {
		return PhoneNumberUtil.getInstance().formatInOriginalFormat(cellPhone,
				null);
	}

	public Date getDob() {
		return dob;
	}

	public String getName() {
		return name.getName();
	}

	public String getFullName() {
		return name.getFullName();
	}

	public void setName(Name name) {
		this.name = name;
	}

	public void setEmail(EmailAddress emailAddress) {
		this.emailAddress = emailAddress;
		
	}
	public int getAge() {
		if (dob == null)
			return -1;
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		birth.setTime(dob);

		int yrAge = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);

		int leapYearAdjust = calculateLeapYearAdjustment(birth);
		return ((now.get(Calendar.DAY_OF_YEAR) + leapYearAdjust)
				- birth.get(Calendar.DAY_OF_YEAR) >= 0) ? yrAge : --yrAge;
	}

	public Person(Address billingAddress, Image image, Name name, String dobStr,
			String homePhoneStr, String cellPhoneStr, Address homeAddress) {
		
		homePhone
				.setCountryCode(PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
						.ordinal());
		homePhone.setRawInput(homePhoneStr);
		cellPhone
				.setCountryCode(PhoneNumber.CountryCodeSource.FROM_DEFAULT_COUNTRY
						.ordinal());
		cellPhone.setRawInput(homePhoneStr);
		dob = createDob(dobStr);

	}

	public Person() {
	}

	private int calculateLeapYearAdjustment(Calendar birth) {
		Calendar working = Calendar.getInstance();
		working.setTime(birth.getTime());
		working.set(Calendar.MONTH, Calendar.FEBRUARY);
		int leapYearAdjust = 0;
		if (working.getMaximum(Calendar.DAY_OF_MONTH) == 29
				&& birth.get(Calendar.MONTH) > 1
				&& working.getMaximum(Calendar.DAY_OF_MONTH) != 29) {
			leapYearAdjust = 1;
		}
		return leapYearAdjust;
	}

	private Date createDob(String dobStr) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		Date dob;
		try {
			dob = dateFormat.parse(dobStr);
		} catch (ParseException e) {
			throw new ValueCreationException("Unable to parse dob: " + dobStr
					+ " as format " + DATE_FORMAT + ".\n" + e.toString());
		}
		return dob;
	}


}
