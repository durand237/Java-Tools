package com.harold.spring_project.hello_spring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		
		//try to launch a Spring context
		try(var context = new AnnotationConfigApplicationContext(HelloSpringConfig.class)) {
			//configure the values that we want spring to manage for us -@configuration
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("personMethodeCall"));
			//also
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean("personWithParm"));
			
			//list all beans
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
			
		
	}

}
