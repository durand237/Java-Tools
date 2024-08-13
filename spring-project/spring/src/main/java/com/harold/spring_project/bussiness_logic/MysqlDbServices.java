package com.harold.spring_project.bussiness_logic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MysqlDbServices implements BussinesInterface {

	@Override
	public String findMax() {
		return  "hey i am mysql DB";
	}

}
