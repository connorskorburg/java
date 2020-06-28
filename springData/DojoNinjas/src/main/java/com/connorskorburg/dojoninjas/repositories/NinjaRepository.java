package com.connorskorburg.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.connorskorburg.dojoninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>{
	List<Ninja> findAll();
	void deleteById(Long id);
}
