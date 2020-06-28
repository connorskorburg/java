package com.connorskorburg.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.dojoninjas.models.Dojo;
import com.connorskorburg.dojoninjas.models.Ninja;
import com.connorskorburg.dojoninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	//returns all ninjas
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
	//creates a ninja
	public Ninja createNinja(Ninja b) {
		return ninjaRepository.save(b);
	}
	//gets a ninja
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	//updates a ninja
	public Ninja updateNinja(Ninja b) {
		return ninjaRepository.save(b);
	}
	public Ninja updateNinja(Long id, String firstName, String lastName, int age, Dojo dojo) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if(optionalNinja.isPresent()) {
			optionalNinja.get().setFirstName(firstName);
			optionalNinja.get().setLastName(lastName);
			optionalNinja.get().setAge(age);
			optionalNinja.get().setDojo(dojo);
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	//deletes a ninja
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
	}
}
