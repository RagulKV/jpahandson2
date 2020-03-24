package com.ragul.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ragul.model.Country;
import com.ragul.repository.CountryRepository;



@Service
public class CountryService {

	@Autowired
	private CountryRepository cr;
	
	@Transactional
	public List<Country> getAllCountries() {
		
		System.out.println(cr.findAll());
		
		if(cr.findAll()==null)
			return new ArrayList<Country>();
		else
			return cr.findAll();
	}
	
	@Transactional
	public Country findCountryByCode(String c) {
		
		Country country = null;
		
		Optional<Country> opt = cr.findById(c);
		
		if (opt.isPresent())
			return opt.get();
		else
			return country;
	}

	@Transactional
	public void addCountry(Country cy) {
		cr.save(cy);
	}
	

	@Transactional
	public void updateCountry(Country nc) {
		
		Country cy = null;
		
		Optional<Country> opt = cr.findById(nc.getCode());
		
		if (opt.isPresent())
			cy = opt.get();
		
		cy.setName(nc.getName());
		cr.save(cy);
	}
	
	@Transactional
	public void deleteCountry(String c) {
		
		Country cy = null;
		Optional<Country> opt = cr.findById(c);
		
		if (opt.isPresent())
			cy = opt.get();
		
		cr.delete(cy);
	}

	@Transactional
	public List<Country> searchCharacter (Character s){
		return cr.findByCharacter(s);
	}
	
	@Transactional
	public List<Country>  search (String str){
		return cr.findByNameContaining(str);
	}
	
	@Transactional
	public List<Country>  searchAsc (String str){
		return cr.findByNameContainingOrderByNameAsc(str);
	
	}
	
}
