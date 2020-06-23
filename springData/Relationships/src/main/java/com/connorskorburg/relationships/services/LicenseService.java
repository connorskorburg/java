package com.connorskorburg.relationships.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.relationships.models.License;
import com.connorskorburg.relationships.models.Person;
import com.connorskorburg.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	//returns all licenses
	public List<License> allLicenses(){
		return licenseRepository.findAll()
;	}
	//creates a license
	public License createLicense(License b) {
		return licenseRepository.save(b);
	}
	//retrieves a license
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepository.findById(id);
		if(optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
	public License updateLicense(License b) {
		return licenseRepository.save(b);
	}
	//updates a license
	public License updateLicense(Long id, String number, Date expirationDate, String state, Person person) {
		Optional<License> optionalLicense = licenseRepository.findById(id);
		if(optionalLicense.isPresent()) {
			optionalLicense.get().setNumber(number);
			optionalLicense.get().setExpirationDate(expirationDate);
			optionalLicense.get().setNumber(number);
			optionalLicense.get().setPerson(person);
			return optionalLicense.get();
		} else {
			return null;
		}
	}
	//deletes a license
	public void deleteLicense(Long id) {
		licenseRepository.deleteById(id);
	}
}
