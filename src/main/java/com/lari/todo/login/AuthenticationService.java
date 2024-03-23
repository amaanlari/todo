package com.lari.todo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("amaanlari");
        boolean isValidPassword = password.equals("password");

        return isValidUsername && isValidPassword;
    }
}
