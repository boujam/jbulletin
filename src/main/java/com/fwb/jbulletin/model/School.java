package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class School extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1919341235259136303L;

	private String name;
	
	private String network;
	
	@OneToMany(mappedBy="school")
	private List<AcademicYear> academicYears = new ArrayList<AcademicYear>();
	
	public School() {
		System.out.println("inside constructor of Class School : " + this.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}
	
	public List<AcademicYear> getAcademicYears() {
		return academicYears;
	}

	public void setAcademicYears(List<AcademicYear> academicYears) {
		this.academicYears = academicYears;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
