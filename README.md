# Online Learning Platform Demo

A user comes to the platform to browse an online course. We as a provider want to provide content in a structured way, such that it provides a natural ability to the user to navigate around the content and understand content structuring.

This demo is to show how user can navigate in hierarchical structure of different courses.

# Techologies

  - Spring boot for REST API
  - Maven (Build Tool)
  - h2 (In memory Database)
  - Swagger Documentaion

# Pre-requisites
  - Data to ber persisted before running this application
  - You can execute schema.sql and data.sql files for data initialization
  - Apache Maven should be already installed

# Run this application
   - Go to the project directory "onlinelearningplateform"
   - Start the application using :  mvn spring-boot:run
   
# Use this application
- Access the Database using : http://localhost:8080/h2
- Access the portal using : http://localhost:8080/swagger-ui.html
  - http://localhost:8080/api/courses api to get all main courses from output you will get parent courseids.
  - http://localhost:8080/api/courses/{courseid} api to get all sub sections and leaf nodes by using above parent courseid.