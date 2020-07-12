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
	
	@RequestMapping("/questions/new")
	public String newQuestion() {
		return "WEB-INF/NewQuestion.jsp";
	}
	
	@RequestMapping("/questions")
	public String questionsDash(Model model) {
		model.addAttribute("questions", questionService.allQuestions());
		return "questions/WEB-INF/Questions.jsp";
	}
	@RequestMapping(value="/createQuestion", method=RequestMethod.POST)
	public String createQuestion(@RequestParam(value="question") String question, @RequestParam(value="tags") String tags) {

		Question newQuestion = new Question(question);
		questionService.createQuestion(newQuestion);

		List<String> newTags = (List<String>)Arrays.asList(tags.trim().split("\\s*,\\s*"));
		
		ArrayList<Tag> allTags = (ArrayList)tagService.allTags();

		System.out.println(allTags.size());
		System.out.println(newTags.size());
		
//		for(int i = 0; i < allTags.size(); i++) {
//			for(int x = 0; x < newTags.size(); i++) {
//				String tag = newTags.get(i);
//				if(tag == allTags.get(i).getSubject()) {
//					System.out.println("Match");
//					System.out.println("New Tag: " + tag);
//					System.out.println("All Tags: " + allTags.get(i).getSubject());
//				}
//			}
//		}
		
		for(int i = 0; i < newTags.size(); i++) {
			for(Tag t : allTags) {
				if(newTags.get(i).contentEquals(t.getSubject())) {
					System.out.println("MATCH");
					System.out.println("T: " + t.getSubject());
					System.out.println("New Tag: " + newTags.get(i));
				} 
			}
		}
		
		
		ArrayList<Tag> addedTags = new ArrayList<Tag>();
		for(int i = 0; i < newTags.size(); i++) {
			addedTags.add(tagService.createTag(newTags.get(i)));
		}
		
		
		newQuestion.setTags(addedTags);
		questionService.createQuestion(newQuestion);
		System.out.println("Added Tags " + addedTags);
		System.out.println("New Tags " + newTags);

		return "redirect:/questions/" + newQuestion.getId();
	}
	
	@RequestMapping("/questions/{id}")
	public String showQuestion(@PathVariable(value="id") Long id, Model model) {
		Question question = questionService.findQuestion(id);
		model.addAttribute("question", question);
		return "WEB-INF/ShowQuestion.jsp";
	}
}
