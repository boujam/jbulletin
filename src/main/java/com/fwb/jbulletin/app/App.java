package com.fwb.jbulletin.app;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fwb.jbulletin.dao.AssignmentDao;
import com.fwb.jbulletin.dao.SchoolDao;
import com.fwb.jbulletin.dao.StudentDao;
import com.fwb.jbulletin.model.Assignment;
import com.fwb.jbulletin.model.School;
import com.fwb.jbulletin.service.PopulateDatabaseService;
import com.fwb.jbulletin.service.StudentService;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentService ss = (StudentService) context.getBean("studentService");
		StudentDao sDao = (StudentDao) context.getBean("studentDao");

		PopulateDatabaseService populate = (PopulateDatabaseService) context.getBean("populateDatabaseService");
		populate.start();
	
				
		SchoolDao schoolDao = (SchoolDao) context.getBean("schoolDao");
		List<School> schools = schoolDao.findall();
		
		Date academicYearDate = schools.get(0).getAcademicYears().get(0).getYear();
						
		AssignmentDao assignmentDao = (AssignmentDao) context.getBean("assignmentDao");
		List<Assignment> assignments = assignmentDao.findall();
				
		System.out.println("end");
		
	}

}
