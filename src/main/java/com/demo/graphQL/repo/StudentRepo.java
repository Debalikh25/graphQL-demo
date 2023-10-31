package com.demo.graphQL.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.graphQL.models.Student;
import com.demo.graphQL.models.Subject;


public class StudentRepo {
	
	
     private List<Student> students = new ArrayList<Student>();
     
     
     public StudentRepo() {
    	 
    	 Subject subject1 = new Subject(1 , "Java" , 80);
    	 Subject subject2 = new Subject(2 , "Python" , 98);
    	 Subject subject3 = new Subject(3 , "C++" , 34);
    	 Subject subject4 = new Subject(4 , "OS" , 75);
    	 Subject subject5 = new Subject(5 , "Javascript" , 90);
    	 Subject subject6 = new Subject(6 , "Ruby" , 50);
    	 
    	 
    	 List<Subject> list1 = Arrays.asList(subject1 , subject2 , subject3);
    	 
    	 List<Subject> list2 = Arrays.asList(subject4 , subject5 , subject6);
    	 
    	 
    	 Student s1 = new Student(21, "Rohit" , "Male" , 24 , list1);
    	 
    	 Student s2 = new Student(27, "Samanta" , "Female" , 23 , list2);
    	 
    	 this.students.add(s1);
    	 this.students.add(s2);
   	 
     }
     
     
     public List<Student> getStudents(){
    	 return this.students;
     }
     
      
     public Student getStudent(String name) {
    	 
    	   for(Student student : this.students) {
    		   if(student.getName().equalsIgnoreCase(name)) {
    			   return student;
    		   }
    	   }
    	 return null;
     }
     
     
     
     public List<Subject> getSubjects(String name) {
    	 
  	   for(Student student : this.students) {
  		   if(student.getName().equalsIgnoreCase(name)) {
  			   return student.getSubjects();
  		   }
  	   }
  	 return  null;   
  	}
     
     public Student createStudent(int roll , String name , String gender , int age , List<Subject> subjects) {
    	 
    	   Student newStudent  =  new Student(roll , name, gender , age , subjects);
    	   
    	   this.students.add(newStudent);
    	   
    	   return newStudent;
    	 
     }

}
