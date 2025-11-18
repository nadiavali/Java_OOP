package com.nadia.spring.learn_JPA_hibernate.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nadia.spring.learn_JPA_hibernate.Course.JPA.CourseJPARepository;

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner{

    @Autowired
    private CourseJPARepository jpaRepository;

      @Override
    public void run(String... args) throws Exception {
        // in SQL single quotes are used for String values in java we use double quotes
        jpaRepository.insert(new Course(1, "Learn AWS JPA Hibernate 2026", "Nadia"));
        jpaRepository.insert(new Course(2, "Learn Azure JPA Hibernate 2026", "Nadia"));
        jpaRepository.insert(new Course(3, "Learn GCP JPA Hibernate 2026", "Nadia"));
        jpaRepository.deleteById(2);
        System.out.println(jpaRepository.findById(1));
    
    }
    
}
