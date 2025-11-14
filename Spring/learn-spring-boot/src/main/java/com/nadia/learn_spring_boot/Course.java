package com.nadia.learn_spring_boot;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Course {
    private long id;
    private String name;
    private String author;

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
    }

    
}

@RestController
class CourseControler {

       private List<Course> courses = new ArrayList<>(
        Arrays.asList(
            new Course(1, "Learn AWS", "Nadia"),
            new Course(2, "Learn Azure", "Nadia"),
            new Course(3, "Learn GCP", "Nadia")
        ));

    @GetMapping("/")          // <-- hit http://localhost:8080/
    public String home() { return "It works!"; }

    @RequestMapping("/courses/")
    public List<Course> retriveAllCourses() {
            return courses;
                }

    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable int id) {
        //code to delete course
         courses.removeIf(courses -> courses.getId()== id);
    
}

    @PostMapping("/courses/{id}")
    public void addCourse(@PathVariable long id) {
        courses.add(new Course(id, "New Course", "New Author"));    
}
}