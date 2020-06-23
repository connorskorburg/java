package com.connorskorburg.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.relationships.models.License;
import com.connorskorburg.relationships.models.Person;
import com.connorskorburg.relationships.repositories.PersonRepository;


@Service
public class PersonService {
	private final PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		 this.personRepository = personRepository;
	}
	//find all people
	public List<Person> allPeople(){
		return personRepository.findAll();
	}
	//creates a person
	public Person createPerson(Person b) {
		return personRepository.save(b);
	}
	//finds person
	public Person findPerson(Long id) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			return optionalPerson.get();
		} else {
			return null;
		}
	}
	public Person updatePerson(Person b) {
		return personRepository.save(b);
	}
	//updates a person
	public Person updatePerson(Long id, String firstName, String lastName, License license) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			optionalPerson.get().setFirstName(firstName);
			optionalPerson.get().setLastName(lastName);
			optionalPerson.get().setLicense(license);
			return optionalPerson.get();
		} else {
			return null;
		}
	}
	//updates a person
	public Person updatePerson(Long id, String firstName, String lastName) {
		Optional<Person> optionalPerson = personRepository.findById(id);
		if(optionalPerson.isPresent()) {
			optionalPerson.get().setFirstName(firstName);
			optionalPerson.get().setLastName(lastName);
			return optionalPerson.get();
		} else {
			return null;
		}
	}
	//delete person
	public void deletePerson(Long id) {
		personRepository.deleteById(id);
	}
}
