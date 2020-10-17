package com.sbit.demo.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/home")
public class PathVariableController {

	@GetMapping(value = "/courses/{course-name}")
	public String getCourseDetails(@PathVariable("course-name") String courseName) {
		
		return "course :"+courseName +"\n"
				+ "faculties :"+ Arrays.asList("Shobhit","Ashok");
	}
	
	@GetMapping(value = "/courses/{course-name}/faculty/{faculty}")
	public String getCourseDuration(
			@PathVariable("course-name") String courseName,
			@PathVariable("faculty") String faculty) {
				
		return "Course: " + courseName + "\n"+
				"faculty: "+ faculty + "\n"+
				"Duration: "+ 160+"Days" ;
		}
		
	}
	
