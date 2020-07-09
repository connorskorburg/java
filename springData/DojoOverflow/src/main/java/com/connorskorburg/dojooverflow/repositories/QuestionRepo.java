package com.connorskorburg.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.connorskorburg.dojooverflow.models.Question;

@Repository
public interface QuestionRepo extends CrudRepository<Question, Long> {

}
