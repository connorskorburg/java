package com.connorskorburg.dojooverflow.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.dojooverflow.models.Answer;
import com.connorskorburg.dojooverflow.models.Question;
import com.connorskorburg.dojooverflow.repositories.AnswerRepo;

@Service
public class AnswerService {
	private AnswerRepo answerRepo;
	
	public AnswerService(AnswerRepo answerRepo) {
		this.answerRepo = answerRepo;
	}
	
	//returns all answers
	public Iterable<Answer> allAnswers(){
		return answerRepo.findAll();
	}

	//creates an answer
	public Answer createAnswer(Answer b) {
		return answerRepo.save(b);
	}
	
	//returns an answer
	public Answer findAnswer(Long id) {
		Optional<Answer> optionalAnswer = answerRepo.findById(id);
		if(optionalAnswer.isPresent()) {
			return optionalAnswer.get();
		} else {
			return null;
		}
	}
	
	//updates an answer
	public Answer updateAnswer(Answer b) {
		return answerRepo.save(b);
	}
	
	public Answer updateAnswer(Long id, String answer, Question question) {
		Optional<Answer> optionalAnswer = answerRepo.findById(id);
		if(optionalAnswer.isPresent()) {
			optionalAnswer.get().setAnswer(answer);
			optionalAnswer.get().setQuestion(question);
			return optionalAnswer.get();
		} else {
			return null;
		}
	}
	
	//deletes an answer
	public void deleteAnswer(Long id) {
		answerRepo.deleteById(id);
	}
}
