package com.acnapi.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.acnapi.demo.domain.Person;
import com.acnapi.demo.repository.PersonRepository;

@Service
@Transactional
public class PersonService {

	private final Logger log = LoggerFactory.getLogger(PersonService.class);
	
	@Autowired
	private PersonRepository hwRepo;
	
	public List<Person> findAll(){
		log.debug("Get all Persons");
		return hwRepo.findAll();
	}
}
