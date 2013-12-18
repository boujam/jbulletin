package com.fwb.jbulletin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.fwb.jbulletin.dao.ClassroomDao;
import com.fwb.jbulletin.dao.StudentDao;
import com.fwb.jbulletin.model.Assignment;
import com.fwb.jbulletin.model.Classroom;
import com.fwb.jbulletin.model.Student;
import com.fwb.jbulletin.service.AssignmentService;

@Controller
public class AssignmentCreateController {

	@Autowired StudentDao studentDao;
	@Autowired ClassroomDao classroomDao;
	@Autowired AssignmentService assignmentService;
	
	
	AssignmentCreateController(){
		System.out.println("construct bean : [assignmentCreateController] " + this.toString());
	}

	@RequestMapping("assignmentcreate")
	public ModelAndView assignmentCreate(){
		List<Student> students = studentDao.findall();
		List<Classroom> classrooms = classroomDao.findall();
		ModelAndView mv = new ModelAndView("assignmentcreate");
		mv.addObject("allstudents", students);
		mv.addObject("allclassrooms", classrooms);
		return mv;
	}
	
	@RequestMapping("assignmentcreatesubmit")
	public ModelAndView assignmentCreateSubmit(@RequestParam("student") long studentId,
												@RequestParam("classroom") long classroomId,
												@RequestParam("comment") String comment){
		
		
		Student student = studentDao.findStudentById(studentId);
		Classroom classroom = classroomDao.findClassroomById(classroomId);
		
		Assignment assignment = new Assignment();
		assignment.setStudent(student);
		assignment.setClassroom(classroom);
		assignment.setSignInDate(new Date());
		assignment.setComment(comment);
		assignmentService.create(assignment);
		
		return new ModelAndView("index");
	}
	
	
}
