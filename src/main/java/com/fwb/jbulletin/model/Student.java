package com.fwb.jbulletin.model;

import javax.persistence.Entity;

@Entity
public class Student extends BaseEntity {
	
	private String firstName;
	private String lastName;
		
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
	
	
	
}
