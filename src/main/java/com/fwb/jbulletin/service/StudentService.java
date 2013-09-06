package com.fwb.jbulletin.service;


import org.springframework.stereotype.Service;
import com.fwb.jbulletin.model.Student;

@Service
public class StudentService  extends BaseService {

	public void addStudent (Student student) {
		em.persist(student);
	}
	
	
}
