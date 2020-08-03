package com.sendev.jwtauth.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.sendev.jwtauth.model.Course;
import com.sendev.jwtauth.service.CourseService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CourseController {

    @Autowired
    private CourseService courseManagementService;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseManagementService.findAll();
    }

    /*
    @GetMapping("/instructors/{username}/courses")
    public List<Course> getAllCourses(@PathVariable String username) {
        return courseManagementService.findAll();
    }
    */
}