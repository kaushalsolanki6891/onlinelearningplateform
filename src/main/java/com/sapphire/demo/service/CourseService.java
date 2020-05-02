package com.sapphire.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapphire.demo.dto.CourseDTO;
import com.sapphire.demo.dto.ILeafTypeAndCount;
import com.sapphire.demo.model.CourseMst;
import com.sapphire.demo.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository repository;
	
	
	public List<CourseDTO> getMainCourses()
	{
		List<CourseMst> result = (List<CourseMst>) repository.findMainCourses();
		
		if(result.size() > 0) {
			return convertCourseMstListToCourseDTOList(result);
		} else {
			return new ArrayList<CourseDTO>();
		}
	}
	
	public List<CourseDTO> getCourseSubSectionsOrLeafs(Long courseId)
	{
		List<CourseMst> result = (List<CourseMst>) repository.findCoursesSubSections(courseId);
		
		if(result.size() > 0) {
			return convertCourseMstListToCourseDTOList(result);
		} else {
			return new ArrayList<CourseDTO>();
		}
	}
	
	private  List<CourseDTO> convertCourseMstListToCourseDTOList(List<CourseMst> courseMstList) {
		List<CourseDTO> courses = new ArrayList<CourseDTO>();
		
		courseMstList.forEach(courseMst -> {
			courses.add(convertCourseMstToCourseDTO(courseMst));
		});
		
		return courses;

	}
	
	private CourseDTO convertCourseMstToCourseDTO(CourseMst courseMst) {
		CourseDTO course = new CourseDTO();
		course.setCourseId(courseMst.getCourseId());
		course.setCourseName(courseMst.getCourseName());
		if(courseMst.getParent() != null) {
			course.setCourseParentId(courseMst.getParent().getCourseId());
		}
		course.setLeafType(courseMst.getLeafType());
		course.setLevel(courseMst.getLevel());
		setDescription(course);
		
		return course;
	}
	
	private void setDescription(CourseDTO course) {
		List<ILeafTypeAndCount> result = repository.getLeafTypeAndCount(course.getCourseId());
		String description = "";
		boolean firstTime = true;
		
		for(ILeafTypeAndCount leaf:result) {
			if(!firstTime) {
				description += ", ";
			}
			description += leaf.getCount() + " " + leaf.getLeafType();
			firstTime = false;
		}
		course.setDescription(description);
	}
	
}