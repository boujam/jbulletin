package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class School extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1919341235259136303L;

	private String name;
	
	private String network;
	
	@OneToMany @JoinColumn(name="school_id")
	List<AcademicYear> years = new ArrayList<AcademicYear>();
	
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

	public List<AcademicYear> getYears() {
		return years;
	}

	public void setYears(List<AcademicYear> years) {
		this.years = years;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
