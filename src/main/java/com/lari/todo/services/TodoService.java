package com.lari.todo.services;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import com.lari.todo.models.Todo;

public class TodoService {
    private static List<Todo> todos = new ArrayList<Todo>();
    static {
        todos.add(new Todo(1L, "in28minutes", "Learn Spring Boot", LocalDate.now(), false));
        todos.add(new Todo(2L, "in28minutes", "Learn React", LocalDate.of(24, 3, 28), false));
        todos.add(new Todo(3L, "in28minutes", "Learn Angular", LocalDate.of(24, 3, 28), false));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
    }
}
