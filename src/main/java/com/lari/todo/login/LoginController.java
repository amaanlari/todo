package com.lari.todo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationService authenticationService;

    LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(path = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String loginPost(@RequestParam String username, @RequestParam String password,
            ModelMap model) {
        if (!authenticationService.authenticate(username, password)) {
            model.put("errorMessage", "Invalid Credentials. Please try again!");
            return "login";
        }
        model.put("username", username);
        return "welcome";
    }
}
