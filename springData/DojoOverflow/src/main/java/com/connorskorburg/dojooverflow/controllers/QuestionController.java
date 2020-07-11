package com.connorskorburg.dojooverflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.dojooverflow.models.Tag;
import com.connorskorburg.dojooverflow.services.AnswerService;
import com.connorskorburg.dojooverflow.services.QuestionService;
import com.connorskorburg.dojooverflow.services.TagService;

@Controller
public class QuestionController {
	
	private QuestionService questionService;
	private AnswerService answerService;
	private TagService tagService;
	
	public QuestionController(QuestionService questionService, TagService tagService, AnswerService answerService) {
		this.questionService = questionService;
		this.tagService = tagService;
		this.answerService = answerService;
	}
	
	@RequestMapping("/questions/new")
	public String newQuestion() {
		return "WEB-INF/NewQuestion.jsp";
	}
	
	@RequestMapping("/questions")
	public String questionsDash() {
		return "questions/WEB-INF/Questions.jsp";
	}
	@RequestMapping(value="/createQuestion", method=RequestMethod.POST)
	public String createQuestion(@RequestParam(value="question") String question, @RequestParam(value="tags") String tags) {

//		Question newQuestion = new Question(question);
//		questionService.createQuestion(newQuestion);

		List<String> newTags = (List<String>)Arrays.asList(tags.trim().split("\\s*,\\s*"));
		System.out.println(newTags);
		ArrayList<Tag> addedTags = new ArrayList<Tag>();
		Tag myTag = new Tag("hello world");
		for(int i = 0; i < newTags.size(); i++) {
			addedTags.add(new Tag(newTags.get(i)));
//			addedTags.add(tagService.createTag(newTags.get(i)));
			System.out.println("show: " + newTags.get(i));
		}
		System.out.println(addedTags);
//		newQuestion.setTags(addedTags);
//		questionService.createQuestion(newQuestion);
		System.out.println(question);
		System.out.println(newTags);

		return "questions/WEB-INF/NewQuestion.jsp";
	}
}
