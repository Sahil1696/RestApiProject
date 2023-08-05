package com.project.RestApiProject.Contoller;

import com.project.RestApiProject.Entity.Course;
import com.project.RestApiProject.Service.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    CourseDao courseDao;
    //get all the courses from the db
    @GetMapping("/courses")
    public List<Course> getCourses(){
     return  courseDao.getCourse();
    }

    //get course by ID
    @GetMapping("/courses/{id}")
    public Course getCourseById(@PathVariable long id){
        //return "Returning the course with Id "+id;
        return courseDao.getCourseById(id);
    }

    //save course
    @PostMapping("/courses")
    public String saveCourse(@RequestBody Course course){
        return courseDao.saveCourse(course);
    }
    @PutMapping("/courses")
    public String updateCourse(@RequestBody Course course){
        return courseDao.updateCourse(course);
    }

    @DeleteMapping("/courses/{id}")
    public String deleteCourse(@PathVariable String id){
        return  courseDao.deleteCourse(id);
    }
}
