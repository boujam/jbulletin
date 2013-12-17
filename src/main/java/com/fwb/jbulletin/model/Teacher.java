package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Teacher extends BaseEntity {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8136368761173410404L;

	private String firstName;
	
	private String lastName;
	
	@ManyToMany(mappedBy="teachers")
	List<Course> courses = new ArrayList<Course>();
	
	public Teacher() {
		System.out.println("inside constructor of Class Teacher : " + this.toString());
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

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
