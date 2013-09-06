package com.fwb.jbulletin.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class BaseService {

	@PersistenceContext protected EntityManager em;
	protected boolean isManaged;

}
