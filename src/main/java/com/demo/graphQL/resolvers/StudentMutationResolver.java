package com.demo.graphQL.resolvers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.graphQL.models.Student;
import com.demo.graphQL.models.Subject;
import com.demo.graphQL.repo.StudentRepo;

@Controller
public class StudentMutationResolver {
	

	 private StudentRepo repo = new StudentRepo() ;
	
	@MutationMapping
	public Student addStudent(@Argument int roll, @Argument String name, @Argument String gender, @Argument int age , @Argument List<Subject> subjects) {
		 
		return this.repo.createStudent(roll, name, gender, age, subjects);
		 
	} 

}
