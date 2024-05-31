package com.lari.todo.controllers;

import com.lari.todo.models.Todo;
import com.lari.todo.repository.TodoRepository;
import com.lari.todo.services.TodoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:5173", "https://eclectic-nougat-d8c886.netlify.app/"},
    allowCredentials = "true")

public class TodoJpaController {

  private final TodoService todoService;
  private final TodoRepository todoRepository;

  public TodoJpaController(TodoService todoService, TodoRepository todoRepository) {
    super();
    this.todoService = todoService;
    this.todoRepository = todoRepository;
  }

  @GetMapping("/users/{username}/todos")
  public List<Todo> retrieveTodos(@PathVariable String username) {
    //        return todoService.findByUsername(username);
    return todoRepository.findAllByUsername(username);
  }

  @GetMapping("/users/{username}/todos/{id}")
  public Todo retrieveTodo(@PathVariable String username, @PathVariable Long id) {
    //        return todoService.findById(id);
    return todoRepository.findById(id).isPresent() ? todoRepository.findById(id).get() : null;
  }

  @DeleteMapping("/users/{username}/todos/{id}")
  public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable Long id) {
    todoService.deleteById(id);
    todoRepository.deleteById(id);
    return ResponseEntity.noContent().build();
  }

  @PutMapping("/users/{username}/todos/{id}")
  public Todo updateTodo(@RequestBody Todo todo) {
    todoService.updateTodo(todo);
    todoRepository.save(todo);
    return todo;
  }

  @PostMapping("/users/{username}/todos")
  public Todo createTodo(@PathVariable String username, @RequestBody Todo todo) {

//    todo = todoService.addTodo(username, todo.getDescription(), todo.getTargetDate());
    todo.setUsername(username);
    todo.setId(null);
    return todoRepository.save(todo);
  }
}
