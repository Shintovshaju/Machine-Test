package com.finalmt.app.service;

import java.util.List;
import java.util.Optional;

import com.finalmt.app.model.ContactPerson;


public interface IContactPersonService {
	
	public List<ContactPerson> getAllContactPersons();

	public Optional<ContactPerson> getContactPersonByPersonId(Integer personId);

	public void addContactPerson(ContactPerson contact);

	public void updateContactPerson(ContactPerson contact);

	public void deleteContactPerson(Integer personId);

	public List<ContactPerson> getContactPersonByLocation(String location);

}
