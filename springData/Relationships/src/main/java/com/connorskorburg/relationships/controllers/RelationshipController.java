package com.connorskorburg.relationships.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RelationshipController {
	@RequestMapping("/")
	public String index() {
		return "WEB-INF/index.jsp";
	}
}
