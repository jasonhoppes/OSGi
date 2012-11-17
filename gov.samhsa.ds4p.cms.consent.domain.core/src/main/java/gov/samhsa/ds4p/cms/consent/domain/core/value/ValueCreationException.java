package gov.samhsa.ds4p.cms.consent.domain.core.value;

public class ValueCreationException extends RuntimeException {

	private static final long serialVersionUID = 6959905280050933025L;

	public ValueCreationException() {
	}

	public ValueCreationException(String arg0) {
		super(arg0);
	}

	public ValueCreationException(Throwable arg0) {
		super(arg0);
	}

	public ValueCreationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

}
