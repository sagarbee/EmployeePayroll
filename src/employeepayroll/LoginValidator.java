package employeepayroll;

import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sagar
 */
public class LoginValidator {
      
    public HashMap<String, String> validateLogin(String username, String password, String division) {
        HashMap<String, String> errors = new HashMap<>();
        
        if (username == null || username.isEmpty()) {
            errors.put("username", "Username is required");
        }
        
        if (password == null || password.isEmpty()) {
            errors.put("password", "Password is required");
        }
        
        
        return errors;
    }
}
