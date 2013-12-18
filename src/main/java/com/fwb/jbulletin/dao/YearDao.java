package com.fwb.jbulletin.dao;

import org.springframework.stereotype.Repository;

import com.fwb.jbulletin.model.Year;

@Repository
public class YearDao extends BaseDao {

	public YearDao(){
		System.out.println("create bean [yearDao] " + this.toString());
	}

	public Year findYearById (long id) {
		System.out.println("loading year by id from table YEAR");
		Year year = (Year) em.createQuery("select y from Year y where y.id =:id")
				.setParameter("id", id)
				.getSingleResult();
		return year;
	}
	
}
