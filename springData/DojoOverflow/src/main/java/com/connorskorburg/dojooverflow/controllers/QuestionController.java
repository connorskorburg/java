package com.connorskorburg.dojooverflow.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.dojooverflow.models.Answer;
import com.connorskorburg.dojooverflow.models.Question;
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
	//template for adding a question
	@RequestMapping("/questions/new")
	public String newQuestion() {
		return "WEB-INF/NewQuestion.jsp";
	}
	//dashboard for questions
	@RequestMapping("/questions")
	public String questionsDash(Model model) {
		model.addAttribute("questions", questionService.allQuestions());
		return "questions/WEB-INF/Questions.jsp";
	}
	//create question and tags
	@RequestMapping(value="/createQuestion", method=RequestMethod.POST)
	public String createQuestion(@RequestParam(value="question") String question, @RequestParam(value="tags") String tags) {
		//create question
		Question newQuestion = new Question(question);
		questionService.createQuestion(newQuestion);
		//format input
		List<String> newTags = (List<String>)Arrays.asList(tags.trim().split("\\s*,\\s*"));
		
		ArrayList<Tag> allTags = (ArrayList)tagService.allTags();
		ArrayList<Tag> questionTags = new ArrayList<Tag>();
		//check to see if the tag is already in database 
		for(int i = 0; i < newTags.size(); i++) {
			for(Tag t : allTags) {
				if(newTags.get(i).contentEquals(t.getSubject())) {
					Tag myTag = tagService.findTag(t.getId());
					questionTags.add(myTag);
					i++;
				}
			}
			questionTags.add(tagService.createTag(newTags.get(i)));
		}
		//set and save the tags
		newQuestion.setTags(questionTags);
		questionService.createQuestion(newQuestion);

		return "redirect:/questions/" + newQuestion.getId();
	}
	//show question by id
	@RequestMapping("/questions/{id}")
	public String showQuestion(@PathVariable(value="id") Long id, Model model) {
		Question question = questionService.findQuestion(id);
		model.addAttribute("question", question);
		model.addAttribute("answers", question.getAnswers());
		return "WEB-INF/ShowQuestion.jsp";
	}
	
	//show tag
	@RequestMapping("/tags/{id}")
	public String showTag(@PathVariable(value="id") Long id, Model model) {
		Tag tag = tagService.findTag(id);
		model.addAttribute("tag", tag);
		return "WEB-INF/ShowTag.jsp";
	}
	//add answer to question
	@RequestMapping(value="/addAnswer", method=RequestMethod.POST)
	public String addAnswer(@RequestParam(value="question_id") Long question_id, @RequestParam(value="answer") String answer) {
		Question question = questionService.findQuestion(question_id);
		Answer newAnswer = new Answer(answer, question);
		answerService.createAnswer(newAnswer);
		return "redirect:/questions/" + question.getId();		
	}
}
