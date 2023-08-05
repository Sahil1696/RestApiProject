package com.project.RestApiProject.Service;

import com.project.RestApiProject.Entity.Course;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface CourseDao {
    public List<Course> getCourse();
    public Course getCourseById(long id);
    public String saveCourse(Course course);
    public String updateCourse(Course course);
    public String deleteCourse(String id);

}
