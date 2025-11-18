package com.nadia.spring.learn_JPA_hibernate.Course.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

import com.nadia.spring.learn_JPA_hibernate.Course.Course;



@Component
public class CourseSpringDataJpaCommanLineRunner implements CommandLineRunner {

    @Autowired
    private CourseSpringDataJpaRepository dataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        //in SQL single quotes are used for String values in java we use double quotes
        dataJpaRepository.save(new Course(1, "Learn AWS JPA Hibernate 2026", "Jack"));
        dataJpaRepository.save(new Course(2, "Learn Azure JPA Hibernate 2026", "Nadia Data JPA"));
        dataJpaRepository.save(new Course(3, "Learn GCP JPA Hibernate 2026", "Nadia Data JPA"));
        dataJpaRepository.save(new Course(4, "Java", "Nadia"));

        //dataJpaRepository.deleteById(3l);
        System.out.println(dataJpaRepository.findById(1l));
        System.out.println(dataJpaRepository.findAll());
        System.out.println(dataJpaRepository.count());
        //System.out.println(dataJpaRepository.findByAuthor("Jack"));

        System.out.println(dataJpaRepository.findByName("Java"));
        System.out.println(dataJpaRepository.findByName("Learn GCP JPA Hibernate 2026"));
 
    
    }
}
