package com.fwb.jbulletin.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Course extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -185191092927174248L;

	/**
	 * name of the course 
	 */
	private String name;
	
	/**
	 * number of hour 
	 */
	private int hour;	
	
	@ManyToMany(mappedBy="courses")
	List<Classroom> classrooms = new ArrayList<Classroom>();
	
	@ManyToMany @JoinTable(name="course_teacher",
			joinColumns=@JoinColumn(name="course_id"),
			inverseJoinColumns=@JoinColumn(name="teacher_id"))
	List<Teacher> teachers = new ArrayList<Teacher>();
	
	public Course() {
		System.out.println("inside constructor of Class Course : " + this.toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public List<Classroom> getClassrooms() {
		return classrooms;
	}

	public void setClassrooms(List<Classroom> classrooms) {
		this.classrooms = classrooms;
	}

	
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
