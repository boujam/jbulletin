package com.fwb.jbulletin.dao;

import java.util.List;

import javax.persistence.Persistence;
import javax.persistence.PersistenceUtil;

import org.springframework.stereotype.Repository;

import com.fwb.jbulletin.model.School;

@Repository
@SuppressWarnings("unchecked")
public class SchoolDao extends BaseDao {

	public SchoolDao(){
		System.out.println("create bean [schoolDao] " + this.toString());
	}

	public List<School> findall () {
		System.out.println("loading schools from table SCHOOL");
		List <School> schools = (List<School>) em.createQuery("select s from School s").getResultList();
		PersistenceUtil util = Persistence.getPersistenceUtil();

		boolean isObjectLoaded = util.isLoaded(schools.get(0));
		boolean isManaged = em.contains(schools.get(0));
		
		//force lazy loading befor the end of the session
		schools.get(0).getAcademicYears().get(0).getYear();
		
		return schools;
	}
	
}
