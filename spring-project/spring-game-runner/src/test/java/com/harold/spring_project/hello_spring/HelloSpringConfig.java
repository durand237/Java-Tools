package com.harold.spring_project.hello_spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, String address) {};
record Address(String Country, String city, String town, String houseNumber, String postalCode) {};

@Configuration
public class HelloSpringConfig {
	
	@Bean
	public String name() {
		return "Goku";
	}
	
	@Bean
	public int age() {
		return 40;
	}
	
	@Bean //alternative: @Bean(name = "address2") since name is customizable
	public String address() {
		return "Tokyo";
	}
	@Bean //alternative: @Bean(name = "address2") since name is customizable
	public Address fullAddress() {
		return new Address("Japan", "Tokyo", "shibuya", "40-A", "444");
	}
	
	@Bean
	public Person person() {
		var person = new Person("Trunk", 20, "DBZ");
		return person;
	}
	/**
	 * adding object by method
	 * in case of multiple beans of the same type we can use the @Primary attribute or give the other beans a qualifier with qualifier("...")
	*/
	@Bean
	@Primary
	public Person personMethodeCall() {
		var person = new Person(name(), age(), address());
		return person;
	}
	//bean with parameters
	@Bean
	@Qualifier("lastPerson")
	public Person personWithParm(String name, int age, String address) {
		return new Person(name, age, address);
	}

}
