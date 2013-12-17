package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Classroom extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6385759173911567243L;

	/**
	 * code for the classroom
	 */
	private String reference;
	
	/**
	 * full reference for the classroom 
	 */
			
	private String fullReference;
	
	/**
	 * date when the classroom was created 
	 */
	private Date creationDate;
	
	
	@ManyToMany @JoinTable(name="classroom_course",
			joinColumns=@JoinColumn(name="classroom_id"),
			inverseJoinColumns=@JoinColumn(name="course_id"))
	List<Course> courses = new ArrayList<Course>();
	
	@OneToMany(mappedBy="classroom")
	List<Assignment> assignments = new ArrayList<Assignment>();
	
	public Classroom() {
		System.out.println("inside constructor of Class Classrom : " + this.toString());
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getFullReference() {
		return fullReference;
	}

	public void setFullReference(String fullReference) {
		this.fullReference = fullReference;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
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
