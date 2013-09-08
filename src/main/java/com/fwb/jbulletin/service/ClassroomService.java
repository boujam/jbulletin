package com.fwb.jbulletin.service;

import org.springframework.stereotype.Service;

import com.fwb.jbulletin.model.Classroom;

@Service
public class ClassroomService extends BaseService {

	public void addClassroom (Classroom classroom) {
		em.persist(classroom);
	}
}
