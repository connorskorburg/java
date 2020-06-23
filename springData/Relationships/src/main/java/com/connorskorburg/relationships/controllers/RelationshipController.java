package com.connorskorburg.relationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.relationships.models.Person;
import com.connorskorburg.relationships.services.PersonService;

@Controller
public class RelationshipController {
	private final PersonService personService;
	public RelationshipController(PersonService personService) {
		this.personService = personService;
	}
	@RequestMapping("/newPerson")
	public String NewPerson() {
		return "WEB-INF/NewPerson.jsp";
	}
	@RequestMapping("/newLicense")
	public String NewLicense() {
		return "WEB-INF/NewLicense.jsp";
	}
	@RequestMapping(value="/createPerson", method=RequestMethod.POST)
	public String createPerson(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName) {
		Person person = new Person(firstName, lastName);
		personService.createPerson(person);
		return "redirect:/person" + person.getId();		
	}
}
