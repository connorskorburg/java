package com.connorskorburg.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.dojoninjas.models.Dojo;
import com.connorskorburg.dojoninjas.repositories.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	//returns all dojos
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}
	//creates a dojo
	public Dojo createDojo(Dojo b) {
		return dojoRepository.save(b);
	}
	//gets a dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	//updates a dojo
	public Dojo updateDojo(Dojo b) {
		return dojoRepository.save(b);
	}
	public Dojo updateDojo(Long id, String name) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if(optionalDojo.isPresent()) {
			optionalDojo.get().setName(name);
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	//deletes a dojo
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
}
