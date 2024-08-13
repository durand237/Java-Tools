package com.harold.spring_boot_project;

public class Course {

	private int courseId;
	private String courseName;
	private String strudent;
	
	public Course(int courseId, String courseName, String student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.strudent = student;
	}
	
	@Override
	public String toString() {
		return "the course" + " " + courseId + " ";
	}

	public int getCourseId() {
		return courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public String getStrudent() {
		return strudent;
	}
	
	
}
