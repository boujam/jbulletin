package com.fwb.jbulletin.dao;

import org.springframework.stereotype.Repository;

@Repository
public class SchoolDao extends BaseDao {

	public SchoolDao(){
		System.out.println("create bean [schoolDao] " + this.toString());
	}
	
}
