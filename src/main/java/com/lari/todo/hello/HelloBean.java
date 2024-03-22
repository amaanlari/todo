package com.lari.todo.hello;

public class HelloBean {
    int id;
    String message;

    public HelloBean(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloBean [id=" + id + ", message=" + message + "]";
    }
}
