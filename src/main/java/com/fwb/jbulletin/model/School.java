package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class School extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1919341235259136303L;

	private String name;
	
	@ManyToMany (mappedBy="schools")
	List<Year> years = new ArrayList<Year>();
	
	@OneToMany @JoinColumn(name="school_id")
	List<Classroom> classrooms = new ArrayList<Classroom>();
	
	public School() {
		System.out.println("inside constructor of Class School : " + this.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public List<Year> getYears() {
		return years;
	}

	public void setYears(List<Year> years) {
		this.years = years;
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
