/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author sagar
 */
public class UserLogin {
 
    private int id;
    private String username;
    private String password;
    private String division;

    // Getters, setters, constructors
    
    public UserLogin()
    {
        
    }
    
    public UserLogin(String username, String password, String division)
    {
        super();
        this.username = username;
        this.password = password;
        this.division = division;
    }
        // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDivision() {
        return division;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    
    
}

