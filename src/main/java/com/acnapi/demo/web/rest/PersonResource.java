package com.acnapi.demo.web.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acnapi.demo.domain.Person;
import com.acnapi.demo.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonResource {

	private final Logger log = LoggerFactory.getLogger(PersonResource.class);
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons")
	public ResponseEntity<List<Person>> getAllPersons(){
		log.debug("REST request to retrieve the list of resources");
		List<Person> list = personService.findAll();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
