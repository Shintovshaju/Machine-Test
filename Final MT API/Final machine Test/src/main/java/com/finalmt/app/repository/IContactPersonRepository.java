package com.finalmt.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.finalmt.app.model.ContactPerson;

@Repository
public interface IContactPersonRepository extends CrudRepository<ContactPerson, Integer> {
	
	List<ContactPerson> findByLocation(String location);
	
}
