package com.connorskorburg.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.connorskorburg.relationships.models.License;

public interface LicenseRepository extends CrudRepository<License, Long>{
	//return a list of all licenses
	List<License> findAll();
	//deletes a license
	void deleteById(Long id);
	List<License> findTopByOrderByNumberDesc();
}
