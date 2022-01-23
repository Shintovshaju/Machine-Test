package com.finalmt.app.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.finalmt.app.model.ContactPerson;
import com.finalmt.app.repository.IContactPersonRepository;


@Service
public class ContactPersonServiceImp implements IContactPersonService {
	
	@Autowired
	private IContactPersonRepository contactRepository;

	@Override
	public List<ContactPerson> getAllContactPersons() {
		return (List<ContactPerson>) contactRepository.findAll();
	}

	@Override
	public Optional<ContactPerson> getContactPersonByPersonId(Integer personId) {
		return contactRepository.findById(personId);
	}

	@Override
	public void addContactPerson(ContactPerson contact) {
		contactRepository.save(contact);
	}

	@Override
	public void updateContactPerson(ContactPerson contact) {
		contactRepository.save(contact);
	}

	@Override
	public void deleteContactPerson(Integer personId) {
		contactRepository.deleteById(personId);
	}

	@Override
	public List<ContactPerson> getContactPersonByLocation(String location) {
		return (List<ContactPerson>) contactRepository.findByLocation(location);
	}

}
