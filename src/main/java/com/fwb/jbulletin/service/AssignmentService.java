package com.fwb.jbulletin.service;

import org.springframework.stereotype.Service;

import com.fwb.jbulletin.model.Assignment;

@Service
public class AssignmentService extends BaseService {

	public void addAssignment (Assignment assignment) {
		em.persist(assignment);
	}
	
	
}