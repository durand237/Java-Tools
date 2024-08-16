package com.harold.spring_jpa_jdbc_hibernate.rest_controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Repository;

@Repository
public class RestRepository {
	
	//this is a so called DAO service not a typical repo since the data do not comes from a database
	private static List<User> users= new ArrayList<User>();
	
	private static int userCount = 0;
	
	static {
		users.add(new User(++userCount, "goku", LocalDate.now().plusYears(3)));
		users.add(new User(++userCount, "Trunk", LocalDate.now().plusYears(4)));
		users.add(new User(++userCount, "Naruto", LocalDate.now().plusYears(2)));
		users.add(new User(++userCount, "Baki", LocalDate.now().plusYears(4)));
		users.add(new User(++userCount, "Sasuke", LocalDate.now().plusYears(7)));
	}
	
	
	public List<User> findAll() {
		return users;
	}
	
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id); 
		users.removeIf(predicate);
	}
	
	public User addUser(User user) {
		user.setId(++userCount);
		users.add(user);
		return user;
	}
	
}
