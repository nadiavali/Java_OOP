package com.nadia.TodoWebApp.Login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    
    public boolean authenticate(String username, String password) {
        boolean isValidUsername = username.equalsIgnoreCase("Nadia");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");
        return isValidPassword && isValidUsername;
    }
}
