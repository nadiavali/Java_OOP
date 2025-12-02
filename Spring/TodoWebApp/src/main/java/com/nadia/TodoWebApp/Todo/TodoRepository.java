package com.nadia.TodoWebApp.Todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//allows to perform action(curd) on entity
public interface TodoRepository extends JpaRepository<Todo, Integer>{

    public List<Todo> findByUsername(String username);
    
}
