package com.fwb.jbulletin.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fwb.jbulletin.dao.YearDao;
import com.fwb.jbulletin.model.Classroom;
import com.fwb.jbulletin.model.School;
import com.fwb.jbulletin.model.Student;
import com.fwb.jbulletin.model.Year;

@Service
public class PopulateDatabaseService extends BaseService {

	@Autowired YearDao yearDao;
	@Autowired ClassroomService classroomService;
	@Autowired YearService yearService;
	@Autowired SchoolService schoolService;
	@Autowired StudentService studentService;
	
	public void start() {

		createSchool();
		createClassroom();
		createStudents();

	}
	
	public void createSchool() {
		
		for (int i=1; i<5;i++) {   
			
			Year year = new Year();
			year.setAcademicYear(new Date());
			yearService.create(year);
			
			School school = new School();
			school.setName("School " + i);
			school.getYears().add(year);
			schoolService.create(school);
			
		}
	}
	public void createClassroom() {

		for (int u=1; u<8;) {
		
			Year year = yearDao.findYearById(u);
			u=u+2;
		
			for (int i=1; i<7;i++) {   
				
				Classroom classroom1 = new Classroom();
				classroom1.setReference(i + " A");
				classroom1.setFullReference("latine " + i);
				classroom1.setCreationDate(new Date());
				classroomService.create(classroom1);
				
				year.getClassrooms().add(classroom1);
				yearService.update(year);
				
				Classroom classroom2 = new Classroom();
				classroom2.setReference(i + " B");
				classroom2.setFullReference("moderne " + i);
				classroom2.setCreationDate(new Date());
				classroomService.create(classroom2);
	
				year.getClassrooms().add(classroom2);
				yearService.update(year);
				
				Classroom classroom3 = new Classroom();
				classroom3.setReference(i + " C");
				classroom3.setFullReference("sciences " + i);
				classroom3.setCreationDate(new Date());
				classroomService.create(classroom3);
				
				year.getClassrooms().add(classroom3);
				yearService.update(year);
			}
		
		}
	}
	
	/**
	 * Create random students
	 */
	public void createStudents() {

		for (int i=1; i<600;i++) {   
			Student student = new Student();
			student.setFirstName("Student " + i);
			student.setLastName("std " + i);
			studentService.create(student);
		}
	}
	
}
