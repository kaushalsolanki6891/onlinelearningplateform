package com.sapphire.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sapphire.demo.dto.CourseDTO;
import com.sapphire.demo.service.CourseService;

@RestController
public class CourseRestController {
	@Autowired
	CourseService service;
	
	@GetMapping(path = {"/api/courses" })
	public List<CourseDTO> getMainCourse() {
		List<CourseDTO> list = service.getMainCourses();
		return list;
	}

	@GetMapping(path = {"/api/courses/{courseid}" })
	public List<CourseDTO> getCourseSubSections(@PathVariable("courseid") Long courseId) {
		List<CourseDTO> list = service.getCourseSubSectionsOrLeafs(courseId);
		return list;
	}

}
