package com.fwb.jbulletin.service;

import org.springframework.stereotype.Service;
import com.fwb.jbulletin.model.Year;

@Service
public class YearService extends BaseService  {
	
	public void addYear (Year year) {
		em.persist(year);
	}
	
}
