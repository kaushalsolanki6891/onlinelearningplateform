
DROP TABLE IF EXISTS COURSEMST;
 
CREATE TABLE CourseMst (
  courseId INT AUTO_INCREMENT  PRIMARY KEY,
  courseName VARCHAR(250) NOT NULL,
  courseParentId INT NULL,
  leafType VARCHAR(250) NULL,
  level INT NOT NULL DEFAULT 1
);

ALTER TABLE CourseMst 
ADD FOREIGN KEY (courseParentId) 
REFERENCES CourseMst(courseId);