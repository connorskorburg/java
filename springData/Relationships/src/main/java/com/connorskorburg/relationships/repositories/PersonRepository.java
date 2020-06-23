package com.connorskorburg.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.connorskorburg.relationships.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long>{
	//retrieves all people 
	List<Person> findAll();
	// this method deletes a a person by id
    void deleteById(Long id);
}
