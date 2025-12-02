package com.nadia.TodoWebApp.Todo;
import java.time.LocalDate;
import java.util.*;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.Valid;

@Controller
//@SessionAttributes("name")
public class TodoControllerJpa {

    private TodoRepository todoRepository;
    

    public TodoControllerJpa(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    private String getLoggedinUsername() {
        Authentication authentication = 
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        String username= getLoggedinUsername();
        List<Todo> todos = todoRepository.findByUsername(username);
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showAddTodo(ModelMap model) {
        String username= getLoggedinUsername();
        Todo todo = new Todo(null, username, "", LocalDate.now(), false);
        model.put("todo", todo);
        return "addTodo";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpdateTodo(@RequestParam int id, ModelMap model) {
       //this works as well //Todo todo = todoRepository.findById(id).orElseThrow(); // or whatever else
        Todo todo = todoRepository.findById(id).get();

        model.addAttribute("todo",todo); //    <h1 class="mb-4">Your Todos</h1><form:form method="post" modelAttribute="todo" action="/add-todo">
        return "addTodo";
    }
     @RequestMapping(value = "delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoRepository.deleteById(id);
         return "redirect:list-todos";
    }

   @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String saveTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "addTodo";
        }
        //System.out.println(">>> addNewTodo called, desc = " + todo.getDesc());
        String username = getLoggedinUsername();
        todo.setUsername(username);
        todoRepository.save(todo);

        return "redirect:list-todos";
    }

}
