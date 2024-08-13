package com.harold.spring_boot_project.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileMapper {

	@Autowired
	private AppProfileConfig appConfig;
	
	@RequestMapping("/app-config")
	public AppProfileConfig mapper() {
		return appConfig;
	}
}
