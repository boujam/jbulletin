package com.fwb.jbulletin.dao;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import com.fwb.jbulletin.model.Classroom;

@Repository
@SuppressWarnings("unchecked")
public class ClassroomDao extends BaseDao {

	public ClassroomDao(){
		System.out.println("create bean [classroomDao] " + this.toString());
	}

	@Cacheable("classroomsCache")
	public List<Classroom> findall () {
		System.out.println("loading classrooms from table CLASSROOM");
		List <Classroom> classrooms = (List<Classroom>) em.createQuery("select c from Classroom c").getResultList();
		return classrooms;
	}
	
	public Classroom findClassroomById (long id) {
		System.out.println("loading classroom by id from table CLASSROOM");
		Classroom classroom = (Classroom) em.createQuery("select c from Classroom c where c.id =:id")
				.setParameter("id", id)
				.getSingleResult();
		return classroom;
	}

}
