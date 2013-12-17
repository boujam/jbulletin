package com.fwb.jbulletin.util;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fwb.jbulletin.model.Classroom;
import com.fwb.jbulletin.model.Student;
import com.fwb.jbulletin.model.Year;
import com.fwb.jbulletin.service.ClassroomService;
import com.fwb.jbulletin.service.StudentService;
import com.fwb.jbulletin.service.YearService;

@Service
public class PopulateDatabase {

	@Autowired StudentService studentService;
	@Autowired ClassroomService classroomService;
	@Autowired YearService yearService;

	
	public void start() {
		
		createStudents();
		createClassroom();
		createYear();		
	}
	
	/**
	 * Create random students
	 */
	public void createStudents() {
	
		for (int i=0; i<100;i++) {   
        	Student student = new Student();
            student.setFirstName("new" + i);
    		student.setLastName("user" + i);
    		studentService.addStudent(student);
		}
	}
	
	public void createClassroom() {
		
		for (int i=1; i<7;i++) {   
        	Classroom classroom1 = new Classroom();
            classroom1.setReference(i + " A");
    		classroom1.setFullReference("moderne " + i);
    		classroom1.setCreationDate(new Date());
    		classroomService.addClassroom(classroom1);
    		
    		Classroom classroom2 = new Classroom();
            classroom2.setReference(i + " B");
    		classroom2.setFullReference("latine " + i);
    		classroom2.setCreationDate(new Date());
    		classroomService.addClassroom(classroom2);
    		
    		Classroom classroom3 = new Classroom();
            classroom3.setReference(i + " C");
    		classroom3.setFullReference("sciences " + i);
    		classroom3.setCreationDate(new Date());
    		classroomService.addClassroom(classroom3);
		}
	}

	public void createYear() {
		
			Year year = new Year();
			year.setAcademicYear(new Date());
			yearService.addYear(year);
		
	}
	
}
