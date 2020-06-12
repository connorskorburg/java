package com.connorskorburg.routingproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {
	@RequestMapping("")
	public String greetUser(@RequestParam(value="q", required=false) String search) {
		if(search != null) {
			return "<h1>Hello " + search + "</h1>" +
				   "<p>Welcome to SpringBoot!</p>";
		}
		if(search == null) {
			return "<h1>Hello Human!</h1>"
				 + "<p>Welcome to SpringBoot!</p>";
		}
		return "";
	}
}
