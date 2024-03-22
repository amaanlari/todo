package com.lari.todo.login;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.classic.Logger;

@Controller
public class LoginController {

    private Logger logger = (Logger) LoggerFactory.getLogger(LoginController.class);
    
    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.debug("The request parameter is: {}", name);
        return "login";
    }
}
