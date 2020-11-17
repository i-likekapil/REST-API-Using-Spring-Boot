package com.kapil.Spring.Services;

import com.kapil.Spring.Entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;


    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(145,"Java","java core desc"));
        list.add(new Course(1478,"Python","java python desc"));

    }
    @Override
    public List<Course> getCourses() {
        //new CourseServiceImpl();
        System.out.println(list);
        return list;
    }

    @Override
    public Course addCourse(Course course) {
        if(course != null) list.add(course);
        return course;
    }

    @Override
    public Course getCourse(long courseId) {
        Course course = null;
        for(Course c:list){
            if(courseId == c.getId()){
                course=c;
                break;
            }
        }
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        for(Course c:list){
            if(course.getId() == c.getId()){
                c.setTitle(course.getTitle());
                c.setDescription(course.getDescription());
                break;
            }
        }
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        for(Course c:list){
            if(courseId == c.getId()){
                list.remove(c);
                break;
            }
        }
    }
}
