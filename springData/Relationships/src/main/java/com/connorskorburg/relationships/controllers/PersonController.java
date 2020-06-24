package com.connorskorburg.relationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.relationships.models.License;
import com.connorskorburg.relationships.models.Person;
import com.connorskorburg.relationships.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	@RequestMapping("/persons/new")
	public String newPerson() {
		return "WEB-INF/NewPerson.jsp";
	}
	@RequestMapping("/persons/{id}")
	public String getPerson(@PathVariable(value="id") Long id, Model model) {
		Person b = personService.findPerson(id);
		License license = b.getLicense();
		model.addAttribute("license", license);
		model.addAttribute("person", b);
		return "WEB-INF/ShowPerson.jsp";
	}
	@RequestMapping(value="/createPerson", method=RequestMethod.POST)
	public String createPerson(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName) {
		Person person = new Person(firstName, lastName);
		personService.createPerson(person);
		return "redirect:/persons/" + person.getId();		
	}
}
