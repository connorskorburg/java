package com.connorskorburg.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.connorskorburg.dojoninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
	void deleteById(Long id);
}
