package com.project.RestApiProject.Repository;

import com.project.RestApiProject.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OracleRepository extends JpaRepository<Course,String> {
}
