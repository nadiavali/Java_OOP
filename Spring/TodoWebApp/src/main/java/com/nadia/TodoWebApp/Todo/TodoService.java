package com.nadia.TodoWebApp.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;
@Service
public class TodoService {
    private  static List<Todo> todos = new ArrayList<>();
    private static int todosCount = 0;
    static {
    }

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }
    
    public void addToDo(String username, String desc, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(todosCount++, username, desc, targetDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
        
    }
    public void updatedTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
