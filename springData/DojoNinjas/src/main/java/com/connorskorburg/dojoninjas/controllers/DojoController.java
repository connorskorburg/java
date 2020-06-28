package com.connorskorburg.dojoninjas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.dojoninjas.models.Dojo;
import com.connorskorburg.dojoninjas.models.Ninja;
import com.connorskorburg.dojoninjas.services.DojoService;

@Controller
public class DojoController {
	private final DojoService dojoService;
	public DojoController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	@RequestMapping("/dojos/new")
	public String newDojo() {
		return "WEB-INF/NewDojo.jsp";
	}

	@RequestMapping(value="/createDojo", method=RequestMethod.POST)
	public String createDojo(@RequestParam(value="dojoName") String name) {
		Dojo dojo = new Dojo(name);
		dojoService.createDojo(dojo);
		return "redirect:/dojos/" + dojo.getId();
	}
	
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo b = dojoService.findDojo(id);
		List<Ninja> ninjas = b.getNinjas();
		model.addAttribute("dojo", b);
		model.addAttribute("ninjas", ninjas);
		return "WEB-INF/ShowDojo.jsp";
	}
}
