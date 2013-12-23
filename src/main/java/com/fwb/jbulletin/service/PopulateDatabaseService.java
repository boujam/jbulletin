package com.fwb.jbulletin.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fwb.jbulletin.dao.AcademicYearDao;
import com.fwb.jbulletin.model.Classroom;
import com.fwb.jbulletin.model.Course;
import com.fwb.jbulletin.model.School;
import com.fwb.jbulletin.model.Student;
import com.fwb.jbulletin.model.AcademicYear;
import com.fwb.jbulletin.model.Teacher;

@Service
public class PopulateDatabaseService extends BaseService {

	@Autowired AcademicYearDao academicYearDao;
	@Autowired ClassroomService classroomService;
	@Autowired YearService yearService;
	@Autowired SchoolService schoolService;
	@Autowired StudentService studentService;
	@Autowired CourseService courseService;
	@Autowired TeacherService teacherService;
	
	public void start() {

		createSchool();
		createClassroom();
		createStudents();
		createCourse();
		createTeacher();

	}
	
	public void createSchool() {
		
		for (int i=1; i<5;i++) {   
			
			AcademicYear academicYear = new AcademicYear();
			academicYear.setYear(new Date());
			yearService.create(academicYear);
			
			School school = new School();
			school.setName("School " + i);
			school.getYears().add(academicYear);
			schoolService.create(school);
			
		}
	}
	public void createClassroom() {

		for (int u=1; u<8;) {
		
			AcademicYear academicYear = academicYearDao.findYearById(u);
			u=u+2;
		
			for (int i=1; i<7;i++) {   
				
				Classroom classroom1 = new Classroom();
				classroom1.setReference(i + " A");
				classroom1.setFullReference("latine " + i);
				classroom1.setCreationDate(new Date());
				classroomService.create(classroom1);
				
				academicYear.getClassrooms().add(classroom1);
				yearService.update(academicYear);
				
				Classroom classroom2 = new Classroom();
				classroom2.setReference(i + " B");
				classroom2.setFullReference("moderne " + i);
				classroom2.setCreationDate(new Date());
				classroomService.create(classroom2);
	
				academicYear.getClassrooms().add(classroom2);
				yearService.update(academicYear);
				
				Classroom classroom3 = new Classroom();
				classroom3.setReference(i + " C");
				classroom3.setFullReference("sciences " + i);
				classroom3.setCreationDate(new Date());
				classroomService.create(classroom3);
				
				academicYear.getClassrooms().add(classroom3);
				yearService.update(academicYear);
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
	
	public void createCourse() {
	
		Course course1 = new Course();
		course1.setName("Français");
		course1.setHour(4);
		courseService.create(course1);
		
		Course course2 = new Course();
		course2.setName("Mathématique");
		course2.setHour(4);
		courseService.create(course2);
		
		Course course3 = new Course();
		course3.setName("Néerlandais");
		course3.setHour(4);
		courseService.create(course3);
		
		Course course4 = new Course();
		course4.setName("Informatique");
		course4.setHour(1);
		courseService.create(course4);
		
		Course course5 = new Course();
		course5.setName("Physique");
		course5.setHour(1);
		courseService.create(course5);
		
		Course course6 = new Course();
		course6.setName("Mathématique");
		course6.setHour(2);
		courseService.create(course6);
		
		
	}
	
	
	public void createTeacher() {
		
		for (int i=1; i<21;i++) {   
			Teacher teacher = new Teacher();
			teacher.setFirstName("teacher" + i);
			teacher.setLastName("t" + i);
			teacherService.create(teacher);
		}
		
	}
	
	
}
