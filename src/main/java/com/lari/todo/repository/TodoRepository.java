package com.lari.todo.repository;

import com.lari.todo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TodoRepository extends JpaRepository<Todo, Long> {

  List<Todo> findAllByUsername(String username);

}
