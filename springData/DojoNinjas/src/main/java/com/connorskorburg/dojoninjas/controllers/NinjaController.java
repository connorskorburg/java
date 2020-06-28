package com.connorskorburg.dojoninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.dojoninjas.models.Dojo;
import com.connorskorburg.dojoninjas.models.Ninja;
import com.connorskorburg.dojoninjas.services.DojoService;
import com.connorskorburg.dojoninjas.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService ninjaService;
	public NinjaController(NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}
	@Autowired
	private DojoService dojoService;
	
	@RequestMapping("/ninjas/new")
	public String newNinja(Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "WEB-INF/NewNinja.jsp";
	}
	@RequestMapping(value="/createNinja", method=RequestMethod.POST)
	public String createNinja(@RequestParam(value="firstName") String firstName, @RequestParam(value="lastName") String lastName, @RequestParam(value="age") int age, @RequestParam("dojo_id") Long dojo_id) {
		Dojo dojo = dojoService.findDojo(dojo_id);
		Ninja ninja = new Ninja(firstName, lastName, age, dojo);
		ninjaService.createNinja(ninja);
		return "redirect:/dojos/" + dojo.getId();
	}
}
