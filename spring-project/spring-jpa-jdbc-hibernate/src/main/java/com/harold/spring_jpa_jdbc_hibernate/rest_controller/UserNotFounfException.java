package com.harold.spring_jpa_jdbc_hibernate.rest_controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFounfException extends RuntimeException {

	public UserNotFounfException(String message) {
		super(message);
	}
	
}
