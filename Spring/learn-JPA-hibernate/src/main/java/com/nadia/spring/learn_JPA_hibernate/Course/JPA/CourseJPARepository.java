package com.nadia.spring.learn_JPA_hibernate.Course.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nadia.spring.learn_JPA_hibernate.Course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional // A transaction is a “protective bubble” 
//inside which your database operations happen safely.
public class CourseJPARepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course) {
        entityManager.merge(course);
    }

    public Course findById(long id) {
        return entityManager.find(Course.class, id);
    }

    public void deleteById(long id) {

        Course courseDeleted = entityManager.find(Course.class, id);
        entityManager.remove(courseDeleted);

    }
}
