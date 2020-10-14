package com.sbit.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/home")
public class CourseController {

	@GetMapping(value = "/course")
	public String getCourse(
			@RequestParam(
					value="cid", 
					required = false) Integer courseId) {
		
		return "Course Name : \"Java\" Course Id : " + courseId;
	}
}

