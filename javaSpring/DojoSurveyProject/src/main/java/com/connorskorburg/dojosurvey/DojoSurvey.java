package com.connorskorburg.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DojoSurvey {
	@RequestMapping("/")
	public String index() {
		return "/WEB-INF/index.jsp";
	}
	@RequestMapping(value="/processSurvey", method=RequestMethod.POST)
	public String processSurvey(@RequestParam(value="name", required=true) String name, @RequestParam(value="location", required=true) String location, @RequestParam(value="language", required=true) String language, @RequestParam(value="comment", required=false) String comment, HttpSession session, RedirectAttributes redirectAttributes) {
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		if(name.equals("")) {
			redirectAttributes.addFlashAttribute("error", "Please Enter a Name!");
			return "redirect:/";
		}
		return "redirect:/results";
	}
	@RequestMapping(value="/processSurvey", method=RequestMethod.GET)
	public String processSurvey() {
		return "redirect:/";
	}
	@RequestMapping("/results")
	public String results() {
		return "/WEB-INF/results.jsp";
	}
}

