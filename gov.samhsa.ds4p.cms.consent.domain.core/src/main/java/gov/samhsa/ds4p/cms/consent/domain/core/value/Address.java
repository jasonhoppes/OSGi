package gov.samhsa.ds4p.cms.consent.domain.core.value;


public class Address {
	
	private String street1;
	private String street2;
	private String city;
	
	//@Pattern(regexp="^(A[LKSZRAEP]|C[AOT]|D[EC]|F[LM]|G[ANU]|HI|I[ADLN]|K[SY]|LA|M[ADEHINOPST]|N[CDEHJMVY]|O[HKR]|P[ARW]|RI|S[CD]|T[NX] |UT|V[AIT]|W[AIVY])$",message="Invalid state code.")
	private String state;
	
	//@Pattern(regexp="^[0-9]{5}$",message="Invalid zipcode format.")	
	private String zipcode;

	//@Pattern(regexp="^[0-9]{4}$",message="Invalid zipcode suffix format.")	
	private String zipsuffix;

	public Address(String street1, String street2, String city, String state,
			String zipcode, String zipsuffix) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;		
		if(zipsuffix != null) this.zipsuffix = zipsuffix;
	}

	public String getStreet1() {
		return street1;
	}

	public String getStreet2() {
		return street2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipPrefix() {
		return zipcode;
	}

	public String getZipsuffix() {
		return zipsuffix;
	}
	
	public String getZipcode(){
		if(getZipPrefix() == null) return "";
		if(getZipsuffix() == null) return getZipPrefix();
		return getZipPrefix() + "-" + getZipsuffix();
	}

	@Override
	public String toString() {
		return "Address [street1=" + street1 + ", street2=" + street2
				+ ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + ", zipsuffix=" + zipsuffix + "]";
	}
	
	

}
