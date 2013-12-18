package com.fwb.jbulletin.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Assignment extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6223998672005647618L;

	private Student student;
	
	private Classroom classroom;
	
	private Date signInDate;
	
	private Date signOutDate;
	
	private String comment;
	
	public Assignment() {
		System.out.println("inside constructor of Class Assignment : " + this.toString());
	}
		
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Classroom getClassroom() {
		return classroom;
	}

	public void setClassroom(Classroom classroom) {
		this.classroom = classroom;
	}

	public Date getSignInDate() {
		return signInDate;
	}

	public void setSignInDate(Date signInDate) {
		this.signInDate = signInDate;
	}
	
	public Date getSignOutDate() {
		return signOutDate;
	}

	public void setSignOutDate(Date signOutDate) {
		this.signOutDate = signOutDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
}
