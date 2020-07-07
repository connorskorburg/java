package com.connorskorburg.dojooverflow.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuestionController {
	
	@RequestMapping("/questions/new")
	public String newQuestion() {
		return "WEB-INF/NewQuestion.jsp";
	}
	
	@RequestMapping("/questions")
	public String questionsDash() {
		return "questions/WEB-INF/Questions.jsp";
	}
}
