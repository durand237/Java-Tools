package com.harold.spring_jpa_jdbc_hibernate.authentication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthController {
	
	/*
	 * <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		<dependency>
	*/
	@RequestMapping(value="login", method = RequestMethod.GET)
	//@ResponseBody
	public String sayHello(ModelMap model) {
		
		return "helloWorld";
	}
	
}
