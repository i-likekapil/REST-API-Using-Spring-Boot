package com.kapil.Spring.Services;

import com.kapil.Spring.Entities.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();

    Course getCourse(long courseId);

    Course addCourse(Course course);

    void deleteCourse(long courseId);

    Course updateCourse(Course course);
}
