package com.lari.todo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.function.Predicate;

import com.lari.todo.models.Todo;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static long todosCount = 3;

    static {
        todos.add(new Todo(1L, "in28minutes", "Learn Spring Boot", LocalDate.now(), false));
        todos.add(new Todo(2L, "in28minutes", "Learn React", LocalDate.of(2024, 3, 28), false));
        todos.add(new Todo(3L, "in28minutes", "Learn Angular", LocalDate.of(2024, 3, 28), false));
    }

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate =
                todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public Todo addTodo(String username, String description, LocalDate targetDate) {
        Todo todo = new Todo(++todosCount, username, description, targetDate, false);
        todos.add(todo);
        return todo;
    }

    public void deleteById(long id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(long id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
