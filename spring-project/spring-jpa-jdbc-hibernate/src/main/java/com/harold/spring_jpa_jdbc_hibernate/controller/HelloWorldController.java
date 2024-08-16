package com.harold.spring_jpa_jdbc_hibernate.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.harold.spring_jpa_jdbc_hibernate.authentication.AuthController;
import com.harold.spring_jpa_jdbc_hibernate.data_map.Lecture;
import com.harold.spring_jpa_jdbc_hibernate.data_map.LectureRepository;

@Controller
public class HelloWorldController {
	
	private AuthController authController;
	

	public HelloWorldController(AuthController authController) {
		super();
		this.authController = authController;
	}

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("hello-friend")
	@ResponseBody
	public String sayHelloFriend() {
		return "hello friend";
	}
	
	@RequestMapping(value ="/", method = RequestMethod.GET)
	//@ResponseBody
	public String login() {
		//model.addAttribute("goku", name);
		//logger.info("entering the welcome function");
		//logger.error("no parameter found");
		return "helloWorld";
	}
	@RequestMapping(value ="welcome", method = RequestMethod.GET)
	//@ResponseBody
	public String welcome() {
		//logger.info("Requestparameter is {}", model);
		//logger.error("no parameter found");
		return "welcome";
	}
	
	@RequestMapping(value ="welcome", method = RequestMethod.POST)
	//@ResponseBody
	public String sayHello(@RequestParam String username, @RequestParam String password, ModelMap model) {
		model.put("name", username);
		model.put("password", password);
		logger.info("Requestparameter is {}", model);
		//logger.error("no parameter found");
		return authController.sayHello(model);
	}
}
