package com.sapphire.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COURSEMST")
public class CourseMst {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="courseid")
    private Long courseId;
    
    @Column(name="coursename")
    private String courseName;
    
    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "courseparentid", referencedColumnName = "courseid", insertable = false, updatable = false)
    private CourseMst parent;
    
    @Column(name="leaftype")
    private String leafType;
    
    @Column(name="level")
    private Long level;
    
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

	public CourseMst getParent() {
		return parent;
	}

	public void setParent(CourseMst parent) {
		this.parent = parent;
	}

	public String getLeafType() {
		return leafType;
	}

	public void setLeafType(String leafType) {
		this.leafType = leafType;
	}

	public Long getLevel() {
		return level;
	}

	public void setLevel(Long level) {
		this.level = level;
	}

	@Override
    public String toString() {
        return "CourseMst [courseId=" + courseId + ", courseName=" + courseName + 
               ", courseParentId=" + parent.courseId + ", leafType=" + leafType   + ", level=" + level   +"]";
    }
}