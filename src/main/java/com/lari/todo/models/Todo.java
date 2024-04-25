package com.lari.todo.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue(generator = "TODO_SEQUENCE_GENERATOR", strategy = GenerationType.AUTO)
    @SequenceGenerator(
        name = "TODO_SEQUENCE_GENERATOR",
        sequenceName = "TODO_SEQUENCE",
        initialValue = 4,
        allocationSize = 1
    )
    private Long id;
    private String username;
    private String description;
    private LocalDate targetDate;
    private boolean done;

    public Todo() {
        super();
    }

    public Todo(Long id, String username, String description, LocalDate targetDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return String.format("Todo [id=%s, username=%s, description=%s, targetDate=%s, done=%s]",
                id, username, description, targetDate, done);
    }
}
