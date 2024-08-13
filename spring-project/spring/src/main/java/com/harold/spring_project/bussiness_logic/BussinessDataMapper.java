package com.harold.spring_project.bussiness_logic;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class BussinessDataMapper {
	
	private BussinesInterface bussinessInterface;
	
	public BussinessDataMapper(BussinesInterface bussinessInterface) {
		super();
		this.bussinessInterface = bussinessInterface;
	}
	
	public String mapper() {
		return bussinessInterface.findMax();
	}

}
