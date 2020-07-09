package com.connorskorburg.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.dojooverflow.models.Answer;
import com.connorskorburg.dojooverflow.models.Question;
import com.connorskorburg.dojooverflow.models.Tag;
import com.connorskorburg.dojooverflow.repositories.QuestionRepo;

@Service
public class QuestionService {
	private QuestionRepo questionRepo;
	
	public QuestionService(QuestionRepo questionRepo) {
		this.questionRepo = questionRepo;
	}
	
	//returns all questions
	public Iterable<Question> allQuestions(){
		return questionRepo.findAll();
	}
	
	//creates a question
	public Question createQuestion(Question b) {
		return questionRepo.save(b);
	}
	
	//returns a question
	public Question findQuestion(Long id) {
		Optional<Question> optionalQuestion = questionRepo.findById(id);
		if(optionalQuestion.isPresent()) {
			return optionalQuestion.get();
		} else {
			return null;
		}
	}
	
	//updates a question
	public Question updateQuestion(Question b) {
		return questionRepo.save(b);
	}
	
	public Question updateQuestion(Long id, String question, List<Tag> tags, List<Answer> answers) {
		Optional<Question> optionalQuestion = questionRepo.findById(id);
		if(optionalQuestion.isPresent()) {
			optionalQuestion.get().setQuestion(question);
			optionalQuestion.get().setTags(tags);
			optionalQuestion.get().setAnswers(answers);
			return optionalQuestion.get();
		} else {
			return null;
		}
	}
	
	//deletes a question
	public void deleteQuestion(Long id) {
		questionRepo.deleteById(id);
	}
}
