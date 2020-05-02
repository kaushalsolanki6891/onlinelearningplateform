package com.sapphire.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sapphire.demo.dto.ILeafTypeAndCount;
import com.sapphire.demo.model.CourseMst;

@Repository
public interface CourseRepository 
			extends CrudRepository<CourseMst, Long> {
	
	@Query("select c from CourseMst c where c.level = 1")
	public List<CourseMst> findMainCourses();
	
	@Query("select c from CourseMst c where c.parent.courseId =:courseId and c.level = c.parent.level + 1")
	public List<CourseMst> findCoursesSubSections(Long courseId);
	
	@Query(value=" WITH RECURSIVE courseTree (CourseID,CourseName,CourseParentID,LeafType,level) AS (" + 
			"" + 
			" select " + 
			"   CourseID," + 
			"   CourseName," + 
			"   CourseParentID," + 
			"   LeafType," + 
			"    level" + 
			" from CourseMst C" + 
			" Where CourseID = :courseId" + 
			"" + 
			"    UNION ALL" + 
			"" + 
			" select " + 
			"   C1.CourseID," + 
			"   C1.CourseName," + 
			"   C1.CourseParentID," + 
			"   C1.LeafType," + 
			"   C1.level" + 
			" from CourseMst C1" + 
			" Inner Join courseTree C2 On C1.CourseParentID = C2.CourseID" + 
			" )" + 
			" SELECT leaftype as leafType , count(leaftype) as count " + 
			" FROM courseTree where courseid != :courseId " + 
			" group by leaftype  ",  
			
			nativeQuery = true)
	public List<ILeafTypeAndCount> getLeafTypeAndCount(@Param("courseId") Long courseId);

}
