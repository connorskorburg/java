package com.connorskorburg.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.dojooverflow.models.Question;
import com.connorskorburg.dojooverflow.models.Tag;
import com.connorskorburg.dojooverflow.repositories.TagRepo;

@Service
public class TagService {
	private TagRepo tagRepo;
	
	public TagService(TagRepo tagRepo) {
		this.tagRepo = tagRepo;
	}

	//returns all tags
	public Iterable<Tag> allTags(){
		return tagRepo.findAll();
	}
	
	//creates a tag
	public Tag createTag(Tag b) {
		return tagRepo.save(b);
	}
	
	public Tag createTag(String subject) {
		return tagRepo.save(new Tag(subject));
	}
	
	//returns a tag
	public Tag findTag(Long id) {
		Optional<Tag> optionalTag = tagRepo.findById(id);
		if(optionalTag.isPresent()) {
			return optionalTag.get();
		} else {
			return null;
		}
	}
	
	//updates a tag
	public Tag updateTag(Tag b) {
		return tagRepo.save(b);
	}
	
	public Tag updateTag(Long id, String subject, List<Question> questions) {
		Optional<Tag> optionalTag = tagRepo.findById(id);
		if(optionalTag.isPresent()) {
			optionalTag.get().setSubject(subject);
			optionalTag.get().setQuestions(questions);
			return optionalTag.get();
		} else {
			return null;
		}
	}
	
	//deletes a tag
	public void deleteTag(Long id) {
		tagRepo.deleteById(id);
	}
}
