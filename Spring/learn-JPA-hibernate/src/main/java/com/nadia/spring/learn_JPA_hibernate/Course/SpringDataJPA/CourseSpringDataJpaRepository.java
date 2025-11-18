package com.nadia.spring.learn_JPA_hibernate.Course.SpringDataJPA;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nadia.spring.learn_JPA_hibernate.Course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{

    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
    
}
