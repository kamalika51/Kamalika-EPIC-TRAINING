package model;

public class CustomerModel {

	String name;
	String mailid;
	int id;
	public CustomerModel(String name, String mailid, int id) {
		super();
		this.name = name;
		this.mailid = mailid;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
