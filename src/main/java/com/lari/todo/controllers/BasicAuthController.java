package com.lari.todo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
public class BasicAuthController {

  @GetMapping(path = "/basicauth")
  public String basicAuthCheck() {
    return "Successful";
  }
}
