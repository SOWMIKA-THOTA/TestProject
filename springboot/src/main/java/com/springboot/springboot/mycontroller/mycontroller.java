package com.springboot.springboot.mycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springboot.entity.Course;
import com.springboot.springboot.services.CourseService;

@RestController

public class mycontroller {
	
	@Autowired
	private CourseService courseSerivice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to courses application";
		
	}
	
	//get the courses
	
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
	return this.courseSerivice.getCourses();
	}
	
}
