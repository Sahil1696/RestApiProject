package com.project.RestApiProject.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.lang.NonNull;

@Entity
public class Course {
    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

    @Id
    private long courseId;

    private String CourseName;

    private String CourseDescription;

    public Course() {
    }

    public Course(long courseId, String courseName, String courseDescription) {
        this.courseId = courseId;
        CourseName = courseName;
        CourseDescription = courseDescription;
    }
}
