package com.harold.spring_boot_project;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses() {
		return Arrays.asList(
				new Course(1, "learn AWS", "Harold"),
				new Course(2, "learn AWS", "Harold"),
				new Course(3, "learn azure", "Harold"),
				new Course(3, "learn azure", "Harold")
			);
				
	}

}
