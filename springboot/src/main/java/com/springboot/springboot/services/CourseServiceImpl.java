package com.springboot.springboot.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.springboot.springboot.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"Java Core Course", "this course contains basics of java"));
		list.add(new Course(4343, "spring boot course", "creating rest api using spring boot"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO AUTO-generated method stub
		return list;
	}
	

}
