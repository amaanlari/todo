package com.lari.todo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TodoController {

    @RequestMapping(path = "/list-todos", method = RequestMethod.GET)
    public String listAllTodos() {
        return "list-todos";
    }

}
