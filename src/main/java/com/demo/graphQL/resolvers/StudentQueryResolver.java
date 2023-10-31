package com.demo.graphQL.resolvers;

import java.util.List;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.graphQL.models.Student;
import com.demo.graphQL.models.Subject;
import com.demo.graphQL.repo.StudentRepo;

@Controller
public class StudentQueryResolver implements GraphQLQueryResolver {
	
	
	
	private StudentRepo repo = new StudentRepo();
	
	@QueryMapping
	public Student getStudent(@Argument String name) {
		 return this.repo.getStudent(name);
	}
	
	@QueryMapping
	public List<Student> getStudents(){
		
		return this.repo.getStudents();
	}
	
	@QueryMapping
	public List<Subject> getSubjects(@Argument String name){
		 return this.repo.getSubjects(name);
	}
	

}
