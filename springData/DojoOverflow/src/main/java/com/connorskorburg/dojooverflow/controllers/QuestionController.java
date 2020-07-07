package com.connorskorburg.dojooverflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuestionController {
	@RequestMapping("/questions/new")
	public String NewQuestion() {
		return "questions/WEB-INF/NewQuestion.jsp";
	}
}
