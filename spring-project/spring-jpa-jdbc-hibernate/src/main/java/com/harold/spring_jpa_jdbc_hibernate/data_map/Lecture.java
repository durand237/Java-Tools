package com.harold.spring_jpa_jdbc_hibernate.data_map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Lecture {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private int age;
	private String lecture;
	
	
	public Lecture(int id, String name, int age, String lecture) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.lecture = lecture;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", age=" + age + ", lecture=" + lecture + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLecture() {
		return lecture;
	}
	public void setLecture(String lecture) {
		this.lecture = lecture;
	}
	
	
}
