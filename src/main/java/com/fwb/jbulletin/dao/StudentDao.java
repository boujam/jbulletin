package com.fwb.jbulletin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.fwb.jbulletin.model.Student;

@Repository
@SuppressWarnings("unchecked")
public class StudentDao extends BaseDao{
	
	public StudentDao(){
		System.out.println("create bean [studentDao] " + this.toString());
	}

	public List<Student> findall () {
		System.out.println("loading students from table STUDENT");
		List <Student> students = (List<Student>) em.createQuery("select s from Student s").getResultList();
		return students;
	}
	
	public Student findStudentById (long id) {
		System.out.println("loading student by id from table STUDENT");
		Student student = (Student) em.createQuery("select s from Student s where s.id =:id")
				.setParameter("id", id)
				.getSingleResult();
		return student;
	}
	
}
