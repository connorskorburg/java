package com.connorskorburg.relationships.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.relationships.models.License;
import com.connorskorburg.relationships.models.Person;
import com.connorskorburg.relationships.services.LicenseService;
import com.connorskorburg.relationships.services.PersonService;


@Controller
public class LicenseController {
	private final LicenseService licenseService;
	public LicenseController(LicenseService licenseService) {
		this.licenseService = licenseService;
	}
	@Autowired
	private PersonService personService;
	@RequestMapping("/licenses/new")
	public String newLicense(Model model) {
		List<Person> persons = personService.allPeople();
		model.addAttribute("persons", persons);
		ArrayList<String> states = new ArrayList<String>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
				"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
				"Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
				"New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
				"Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
				"Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
		model.addAttribute("states", states);
		return "WEB-INF/NewLicense.jsp";
	}
	@RequestMapping(value="/createLicense", method=RequestMethod.POST)
	public String createLicense(@RequestParam(value="person") Long person, @RequestParam(value="state") String state, @RequestParam(value="expirationDate") String expirationDate, Model model) {
		Person newPerson = personService.findPerson(person);
		String number = licenseService.createLicenseNumber();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = formatter.parse(expirationDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "redirect:/licenses/new";
		}
		License license = new License(number, date, state, newPerson);
		licenseService.createLicense(license);
		model.addAttribute("license", license);
		return "redirect:/persons/" + person;
	}
}
