package com.harold.spring_project;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.BeanFactoryAnnotationUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harold.spring_project.bussiness_logic.BussinessDataMapper;
import com.harold.spring_project.bussiness_logic.MysqlDbServices;
import com.harold.spring_project.game.GameRunner;
import com.harold.spring_project.game.GamingConfig;
import com.harold.spring_project.game.MarioGame;
import com.harold.spring_project.game.NeoGeo;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Configuration
//@ComponentScan("com.harold.spring_project.game")
@ComponentScans({ @ComponentScan(("com.harold.spring_project.game")), @ComponentScan("com.harold.spring_project.bussiness_logic") })
public class GamingAppLauncher {

	public static void main(String[] args) {
		

		//run the  games with spring iOC
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class) ) {
			
			//System.out.println(context.getBean());
			//context.getBean(NeoGeo.class).check();
			context.getBean(GameRunner.class).run();
			
			//question: how to lunch beans of the same class in a row?
			var map = context.getBean("bussinessDataMapper", BussinessDataMapper.class);
			//var mongo = context.getBean("mongo".getClass());
			//System.out.println(mongo.mapper());
			System.out.println(map.mapper());
			
			/*
			//launch the xml configuration file
			 * var context = new ClassPathXmlApplicationContext("contextConfig.xml")
			 * Arrays.stream( context.getBeanDefinitionNames()).forEach(System.out::println);
			*/
		}
	}

}
