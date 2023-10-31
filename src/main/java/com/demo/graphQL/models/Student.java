package com.demo.graphQL.models;

import java.util.List;

public class Student {
	
	private int roll;
	private String name;
	private String gender;
	private  int age;
	private List<Subject> subjects;
	
	
	public Student() {
		
		
	}
	

	public Student(int roll, String name, String gender, int age , List<Subject> subjects) {
		super();
		this.roll = roll;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.subjects = subjects;
	}




	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	
	
	

}
