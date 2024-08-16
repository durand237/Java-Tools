package com.harold.spring_jpa_jdbc_hibernate.rest_controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.parsing.Location;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import jakarta.validation.Valid;

@RestController
public class RestApiController {

	private RestRepository repository;
	private MessageSource msgSource;
	
	public RestApiController(RestRepository repository, MessageSource msgSource) {
		super();
		this.msgSource = msgSource;
		this.repository = repository;
	}

	//pathParameter eg /user/{id}/{}.../{name}
	List<Integer> ranga = new ArrayList<Integer>();
	
	
	/**the versiong of the api can be archieved in three different ways
	 * first one is path config e.g. @getmappin(../v1/...)
	 * second way is through headrs e.g @getmappint(path=url param=v1)
	 * and the last one is through accept config eg @getmappint(path=url produce=.../v1/...)
	 * be aware of url pollution ak too much different url also look if the type is supported by a browser*/
	
	@GetMapping(path="/simple/{num}")
	public List<Integer> pathParam(@PathVariable int num ) {
		if(ranga.isEmpty()) {
			ranga.add(34);
			ranga.add(465);
			ranga.add(365);
			ranga.add(365);
		}
		ranga.add(num);
		return ranga;
	}
	
	/**
	 * we can use entitilink to add links to our restApi response
	 * usin springmvclinkclass to create a link to our functions or more
	 * or we can use jsonProperty on our Entity to customers the field of our json response
	 * we can also make use of static (@JsonIgnore), filtering(@jsonIgnoreProerty(sss,sss) as class level) to filter the field we dont want to send in a response
	 * or we can static filtering with use of the class MappingJacksonValue to filter values in our RestColler with @jsonFilteer Tag on our Entity
	 * */
	
	@GetMapping(path="users")
	public List<User> retrieveUsers() {
		return repository.findAll();
	}
	
	@GetMapping(path="users/{id}")
	public User retrieveUsers(@PathVariable int id) {
		User user = repository.findOne(id);
		if(user == null) {
			throw new UserNotFounfException("id: "+id);
			
		}
		return user;
	}
	
	@DeleteMapping(path="users/{id}")
	public void deleteUsers(@PathVariable int id) {
		repository.deleteById(id);
	}
	
	@PostMapping(path="/users")
	public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
		User addedUser = repository.addUser(user);
		
		//return a link to the created resource as part of our url
		URI location = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(addedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
	}
	
	@GetMapping(path="/hello23")
	public String hello() {
		Locale locale = Locale.ENGLISH;
		//Locale locale = LocaleContextHolder.getLocale();
		return msgSource.getMessage("greating.message", null, "Default message", locale);
	}

	
	
}
