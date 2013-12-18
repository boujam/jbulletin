package com.fwb.jbulletin.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;


@Transactional
abstract public class BaseService {

	@PersistenceContext protected EntityManager em;
	
	
	/**
	 * CRUD operation : to create a record
	 */
	public void create (Object object) {
		em.persist(object);
	}

	public void update (Object object) {
		em.merge(object);
	}
	
}
