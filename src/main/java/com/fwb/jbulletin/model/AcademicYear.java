package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AcademicYear extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7317933684778767588L;

	private Date year;

	@ManyToOne @JoinColumn(nullable=false)
	private School school;
	
	@OneToMany @JoinColumn(name="year_id")
	List<Classroom> classrooms = new ArrayList<Classroom>();
		
	public AcademicYear() {
		System.out.println("inside constructor of Class Year : " + this.toString());
	}
	
	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}
		
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
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
