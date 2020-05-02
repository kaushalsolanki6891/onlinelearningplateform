package com.sapphire.demo.dto;

import java.io.Serializable;

public class CourseDTO implements Serializable {
	private Long courseId;
	private String courseName;
	private Long courseParentId;
	private String leafType;
	private Long level;
	private String description;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Long getCourseParentId() {
		return courseParentId;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	public void setCourseParentId(Long courseParentId) {
		this.courseParentId = courseParentId;
	}

	public String getLeafType() {
		return leafType;
	}

	public void setLeafType(String leafType) {
		this.leafType = leafType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
