package com.finalmt.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finalmt.app.model.ContactPerson;
import com.finalmt.app.service.IContactPersonService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class ContactPersonController {
	
	@Autowired
	private IContactPersonService personService;
	
	@GetMapping("/contacts")
	public List<ContactPerson> getAllContactPersons() {
		return (List<ContactPerson>) personService.getAllContactPersons();
	}

	@GetMapping("/contacts/{personId}")
	public Optional<ContactPerson> getContactPersonByPersonId(Integer personId) {
		return personService.getContactPersonByPersonId(personId);
	}

	@PostMapping("/contacts")
	public void addContactPerson(@RequestBody ContactPerson contact) {
		personService.addContactPerson(contact);
	}

	@PutMapping("/contacts")
	public void updateContactPerson(@RequestBody ContactPerson contact) {
		personService.updateContactPerson(contact);
	}

	@DeleteMapping("/contacts/{personId}")
	public void deleteContactPerson(@PathVariable Integer personId) {
		personService.deleteContactPerson(personId);
	}
	
	@GetMapping("/contacts/{location}")
	public List<ContactPerson> getContactPersonByLocation(String location) {
		return (List<ContactPerson>) personService.getContactPersonByLocation(location);
	}

}
