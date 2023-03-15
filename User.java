package com.entity;

public class User {
	private int id;
	private String name;
	private String email;
	//private int ph;
	private String pass;
	
	
	public User( String name, String email, String pass/*,int ph*/) {
		super();
		this.name = name;
		this.email = email;
		//this.ph = ph;
		this.pass = pass;
	}
	public User() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	} */
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
