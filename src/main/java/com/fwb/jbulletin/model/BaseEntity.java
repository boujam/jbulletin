package com.fwb.jbulletin.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4510829852525978523L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;

	public long getId() {
		return id;
	}

	
}
