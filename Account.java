package model;

public class Account {
	private String name;
	private String mobileno;
	private String aadharid;
	private String emailid;

	public Account() {
		
	}

	public Account(String name, String mobileno, String aadharid, String emailid) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.aadharid = aadharid;
		this.emailid = emailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAadharid() {
		return aadharid;
	}

	public void setAadharid(String aadharid) {
		this.aadharid = aadharid;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}
