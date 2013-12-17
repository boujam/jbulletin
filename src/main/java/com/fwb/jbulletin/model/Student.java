package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * 
 * @author Master
 * @category Entity Student
 */
@Entity
public class Student extends BaseEntity {
	
	/**
	 * generated serial version UID
	 */
	private static final long serialVersionUID = 1681828470964041128L;
	
	private String firstName;
	private String lastName;
		
	/**
	 * Enhanced many-to-many
	 * 
	 */
	@OneToMany(mappedBy="student")
	List<Assignment> assignments = new ArrayList<Assignment>();
	
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
	
	public List<Assignment> getAssignments() {
		return assignments;
	}

	public void setAssignments(List<Assignment> assignments) {
		this.assignments = assignments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
	
	
}
