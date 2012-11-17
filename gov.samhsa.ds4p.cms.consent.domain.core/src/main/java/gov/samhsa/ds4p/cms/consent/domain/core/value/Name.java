package gov.samhsa.ds4p.cms.consent.domain.core.value;

public class Name {

	private String first;
	private String middle;
	private String last;
	private String prefix;
	private String suffix;
	
	public Name(String first2, String middle2, String last2, String prefix2,
			String suffix2) {
		super();
		this.first = first2;
		this.middle = middle2;
		this.last = last2;
		this.prefix = prefix2;
		this.suffix = suffix2;
	}

	protected Name() {}

	public String getFirst() {
		return first;
	}
	public String getMiddle() {
		return (middle != null && middle.length()>0) ? middle + "." : "";

	}
	public String getLast() {
		return last;
	}
	public String getPrefix() {
		return (prefix != null && prefix.length()>0) ? prefix : "";
	}
	public String getSuffix() {
		return (suffix != null && suffix.length()>0) ? suffix : "";
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public void setMiddle(String middle) {
		this.middle = middle;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	
	public String getMiddleInitial(){
		return (middle != null && middle.length()>0) ? middle.substring(0, 1) + "." : "";
	}

	public String getFullName(){
		StringBuilder bldr = new StringBuilder(getPrefix());
		bldr.append(" ");
		bldr.append(getFirst());
		bldr.append(" ");
		bldr.append(getMiddle());
		bldr.append(" ");
		bldr.append(getLast());
		bldr.append(" ");
		bldr.append(getSuffix());
		
		return bldr.toString();
	}

	public String getName(){
		StringBuilder bldr = new StringBuilder(getPrefix());
		bldr.append(" ");
		bldr.append(getFirst());
		bldr.append(" ");
		bldr.append(getMiddleInitial());
		bldr.append(" ");
		bldr.append(getLast());
		bldr.append(" ");
		bldr.append(getSuffix());
		
		return bldr.toString();
	}
	
	@Override
	public String toString() {
		return "Name [getFullName()=" + getFullName() + "]";
	}
	
	
}
