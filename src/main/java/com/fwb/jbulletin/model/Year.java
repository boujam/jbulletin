package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Year extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7317933684778767588L;

	private Date academicYear;

	@OneToMany @JoinColumn(name="year_id")
	List<Classroom> classrooms = new ArrayList<Classroom>();
		
	public Year() {
		System.out.println("inside constructor of Class Year : " + this.toString());
	}
	
	public Date getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Date academicYear) {
		this.academicYear = academicYear;
	}
	
	public List<Classroom> getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(List<Classroom> classrooms) {
		this.classrooms = classrooms;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
