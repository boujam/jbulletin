package com.fwb.jbulletin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.fwb.jbulletin.model.Assignment;


@Repository
@SuppressWarnings("unchecked")
public class AssignmentDao extends BaseDao {

	public AssignmentDao(){
		System.out.println("create bean [assignmentDao] " + this.toString());
	}
	
	public List<Assignment> findall () {
		System.out.println("loading assignments from table ASSIGNMENT");
		List <Assignment> assignments = (List<Assignment>) em.createQuery("select a from Assignment a").getResultList();
		return assignments;
	}
		
}
