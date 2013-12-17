package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Year extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7317933684778767588L;

	private Date academicYear;

	@ManyToMany @JoinTable(name="year_school",
				joinColumns=@JoinColumn(name="year_id"),
				inverseJoinColumns=@JoinColumn(name="school_id"))
	List<School> schools = new ArrayList<School>();
	
	public Year() {
		System.out.println("inside constructor of Class Year : " + this.toString());
	}
	
	public Date getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Date academicYear) {
		this.academicYear = academicYear;
	}
				
	public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
