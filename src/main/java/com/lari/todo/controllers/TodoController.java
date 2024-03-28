package com.lari.todo.controllers;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.lari.todo.models.Todo;
import com.lari.todo.services.TodoService;


@RestController
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class TodoController {

    TodoService todoService;

    public TodoController(TodoService todoService) {
        super();
        this.todoService = todoService;
    }

    @RequestMapping(path = "/list-todos", method = RequestMethod.GET)
    public String listAllTodos(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("in28minutes");
        model.put("todos", todos);
        return "list-todos";
    }

}
