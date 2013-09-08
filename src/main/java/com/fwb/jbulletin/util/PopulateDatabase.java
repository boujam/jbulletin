package com.fwb.jbulletin.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fwb.jbulletin.model.Classroom;
import com.fwb.jbulletin.model.Student;
import com.fwb.jbulletin.service.ClassroomService;
import com.fwb.jbulletin.service.StudentService;

@Service
public class PopulateDatabase {

	@Autowired StudentService studentService;
	@Autowired ClassroomService classroomService;
	
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
        	Classroom classroom = new Classroom();
            classroom.setReference(i + " A");
    		classroom.setFullReference("moderne " + i);
    		classroomService.addClassroom(classroom);
    		
    		Classroom classroom2 = new Classroom();
            classroom2.setReference(i + " B");
    		classroom2.setFullReference("latine " + i);
    		classroomService.addClassroom(classroom2);
    		
    		Classroom classroom3 = new Classroom();
            classroom3.setReference(i + " C");
    		classroom3.setFullReference("sciences " + i);
    		classroomService.addClassroom(classroom3);
		}
	}
	
	public void assignStudentToClassroom() {
		
			Student student = new Student();
		
	}
	
}
