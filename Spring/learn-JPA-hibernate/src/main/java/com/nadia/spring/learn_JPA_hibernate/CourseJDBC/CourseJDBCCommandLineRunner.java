package com.nadia.spring.learn_JPA_hibernate.CourseJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nadia.spring.learn_JPA_hibernate.Course.Course;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        // in SQL single quotes are used for String values in java we use double quotes
        repository.insert(new Course(1, "Learn AWS JPA Hibernate 2025", "Nadia"));
        repository.insert(new Course(2, "Learn Azure JPA Hibernate 2025", "Nadia"));
        repository.insert(new Course(3, "Learn GCP JPA Hibernate 2025", "Nadia"));
        repository.deleteById(2);
        System.out.println(repository.findById(1));
    
    }

 
    
}
