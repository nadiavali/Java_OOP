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
        Todo todo = new Todo(5, username, "", LocalDate.now(), false);
        model.put("todo", todo);
        return "addTodo";
    }
    // //“Hey Spring, please give me whatever the user typed into the input field named description@RequestParam
    //  @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    // public String addNewTodo(@RequestParam String desc , ModelMap model) {
    //     String username= (String)model.get("name");
    //     todoService.addToDo(username, desc, LocalDate.now().plusYears(1), false);
    //     return "redirect:list-todos";
    // }
    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model,@Valid Todo todo, BindingResult result) {
        if (result.hasErrors()) {return "addTodo";}
         String username= (String)model.get("name");
         todoService.addToDo(username, todo.getDesc(), LocalDate.now().plusYears(1), false);
         return "redirect:list-todos";
        }

    @RequestMapping(value = "delete-todo")
    public String deleteTodo(@RequestParam int id, ModelMap model) {
        todoService.deleteById(id);

         return "redirect:list-todos";
    }
}
