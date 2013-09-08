package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
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
		
	@OneToMany(mappedBy="classroom")
	List<Assignment> assignments = new ArrayList<Assignment>();
	
	public Classroom() {
		System.out.println("inside constructor of Class classrom : " + this.toString());
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
