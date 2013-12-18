package com.fwb.jbulletin.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;


@Transactional
abstract public class BaseDao {

	@PersistenceContext EntityManager em;
}
