package com.fwb.jbulletin.model;

import javax.persistence.Entity;

@Entity
public class Student extends baseEntity {
	
	private String firstName;
	private String lastName;
	private String lastName2;
	private String lastName3;
	private String adress;	
	
	public Student() {
		System.out.println("inside constructor of Class Student : " + this.toString());
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName2() {
		return lastName2;
	}

	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}

	public String getLastName3() {
		return lastName3;
	}

	public void setLastName3(String lastName3) {
		this.lastName3 = lastName3;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
	
}
