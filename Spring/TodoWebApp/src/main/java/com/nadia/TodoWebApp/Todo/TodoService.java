package com.nadia.TodoWebApp.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class TodoService {
    private  static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Nadia", 
        "Laern AWS", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "Nadia", 
        "Laern Azure", LocalDate.now().plusYears(1), false));
         todos.add(new Todo(3, "Nadia", 
        "Laern Java", LocalDate.now().plusMonths(5), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
