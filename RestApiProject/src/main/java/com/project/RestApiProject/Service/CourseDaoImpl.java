package com.project.RestApiProject.Service;

import com.project.RestApiProject.Entity.Course;
import com.project.RestApiProject.Repository.OracleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseDaoImpl implements CourseDao {
    //List<Course> courses;
    @Autowired
    OracleRepository oracleRepository;

    public CourseDaoImpl() {
//        courses = new ArrayList<>();
//        courses.add(new Course("1", "Java Spring Boot", "This is spring Boot Course"));
//        courses.add(new Course("2", "Python Course", "This is Python Course"));
    }

    @Override
    public List<Course> getCourse() {
       // return courses;
        System.out.println("testing jenkins cicd pipeline by doing small commentsss");
         return oracleRepository.findAll();
    }

    @Override
    public Course getCourseById(long id) {
//        for (Course course : courses) {
//            if (course.getCourseId().equals(id)) {
//                return course;
//            }
//        }
        //return new Course();
        return oracleRepository.findById(String.valueOf(id)).get();
    }

    @Override
    public String saveCourse(Course course) {
        //courses.add(course);
        oracleRepository.save(course);
        return "Course Saved in DB";
    }

    @Override
    public String updateCourse(Course course) {
//        for (Course c : courses) {
//            if (c.getCourseId().equals(course.getCourseId())) {
//                c.setCourseName(course.getCourseName());
//                c.setCourseDescription(course.getCourseDescription());
//                return "course Updated";
//            }
//        }
        try{
            oracleRepository.save(course);
            return "course updated sucessfully";
        }catch (Exception e){
            return "Did not updated course due to some error ";
        }
        //return "course not Updated";
    }

    @Override
    public String deleteCourse(String id) {
//        for (Course course : courses) {
//            if (course.getCourseId().equals(id)) {
//                courses.remove(course);
//                return "Course Deleted";
//            }
//        }
       Course course = oracleRepository.getOne(String.valueOf(id));
       oracleRepository.delete(course);
        return "Course deleted";
    }
}
