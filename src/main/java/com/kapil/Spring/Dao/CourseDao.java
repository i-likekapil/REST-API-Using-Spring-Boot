package com.kapil.Spring.Dao;

import com.kapil.Spring.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
