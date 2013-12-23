package com.fwb.jbulletin.dao;

import org.springframework.stereotype.Repository;

import com.fwb.jbulletin.model.AcademicYear;

@Repository
public class AcademicYearDao extends BaseDao {

	public AcademicYearDao(){
		System.out.println("create bean [yearDao] " + this.toString());
	}

	public AcademicYear findYearById (long id) {
		System.out.println("loading year by id from table YEAR");
		AcademicYear academicYear = (AcademicYear) em.createQuery("select y from AcademicYear y where y.id =:id")
				.setParameter("id", id)
				.getSingleResult();
		return academicYear;
	}
	
}
