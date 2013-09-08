package com.fwb.jbulletin.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fwb.jbulletin.dao.StudentDao;
import com.fwb.jbulletin.service.StudentService;
import com.fwb.jbulletin.util.PopulateDatabase;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentService ss = (StudentService) context.getBean("studentService");
		StudentDao sDao = (StudentDao) context.getBean("studentDao");
	
		PopulateDatabase pd = (PopulateDatabase) context.getBean("populateDatabase");
		pd.createStudents();
		pd.createClassroom();
		
		System.out.println("end");
		
	}

}
