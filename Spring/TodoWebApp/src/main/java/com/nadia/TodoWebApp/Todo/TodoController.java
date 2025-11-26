package com.nadia.TodoWebApp.Todo;
import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {

    private TodoService todoService;
    

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }


    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("Nadia");
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET)
    public String showAddTodo(ModelMap model) {
        String username= (String)model.get("name");
        Todo todo = new Todo(0, username, "", LocalDate.now(), false);
        model.put("todo", todo);
        return "addTodo";
    }

      @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpdateTodo(@RequestParam int id, ModelMap model) {
        Todo todo = todoService.findById(id);
        model.addAttribute("todo",todo); //    <h1 class="mb-4">Your Todos</h1><form:form method="post" modelAttribute="todo" action="/add-todo">
        return "addTodo";
    }
     @RequestMapping(value = "delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteById(id);
         return "redirect:list-todos";
    }

   @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String saveTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "addTodo";
        }

        String username = (String) model.get("name");
        todo.setUsername(username);

        if (todo.getId() == 0) {
            // NEW TODO
            todoService.addToDo(username, todo.getDesc(), todo.getTargetDate(), false);
        } else {
            // UPDATE EXISTING TODO
            todoService.updatedTodo(todo);
        }

        return "redirect:list-todos";
    }

}
