package com.harold.spring_project.bussiness_logic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Named: meas in jakarta the same as component in spring
//@Component
@Repository
@Qualifier("mongo")
public class MongoDbService implements BussinesInterface {

	@Override
	//@PostConstruct
	//@PreDestroy
	//@Inject: meas in jakarta the same as @autowired in spring 
	public String findMax() {
		return  "hey i am Mongo DB";
	}

}
