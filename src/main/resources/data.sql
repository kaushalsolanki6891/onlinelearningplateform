
--courseId=1  	
INSERT INTO CourseMst
	(courseName,courseParentId,leafType) 
VALUES ('Course A',NULL,'SUB-SECTION');

--courseId=2
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A1 : Week 1',1,'SUB-SECTION', 2);

--courseId=3
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A2 : Week 2',1,'SUB-SECTION', 2);

--courseId=4
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A1 - A11 : Day 1 to 3',2,'SUB-SECTION',3);

--courseId=5
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A1 - A12 : Day 3 to 7',2,'SUB-SECTION',3);

--courseId=6
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A2 - L21 : Learning x',3,'VIDEO',3);

--courseId=7
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A2 - L22 : Learning y',3,'HTML',3);

--courseId=8
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A1-A11-L111 : Learning a', 4, 'TEXT', 4);

--courseId=9
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A1-A11-L112 : Learning b', 4, 'TEXT',4);

--courseId=10
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('A1-A12-L112 : Learning b', 5, 'VIDEO',4);

--courseId=11
INSERT INTO CourseMst
	(courseName,courseParentId,leafType) 
VALUES ('Course B',NULL,'SUB-SECTION');

--courseId=12
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B1 : Week 1',11,'SUB-SECTION', 2);

--courseId=13
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B2 : Week 2',11,'SUB-SECTION', 2);

--courseId=14
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B1 - B11 : Day 1 to 3',12,'SUB-SECTION',3);

--courseId=15
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B1 - B12 : Day 3 to 7',12,'SUB-SECTION',3);


--courseId=16
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B2 - B-L21 : Learning x',13,'VIDEO',3);

--courseId=17
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B2 - B-L22 : Learning y',13,'HTML',3);

--courseId=18
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B1-B11 - B-L111 : Learning a', 14, 'TEXT', 4);

--courseId=19
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B1-B11-B-L112 : Learning b', 14, 'TEXT',4);  	

--courseId=20
INSERT INTO CourseMst
	(courseName,courseParentId,leafType,level) 
VALUES ('B1-B12-B-L112 : Learning b', 15, 'VIDEO',4);