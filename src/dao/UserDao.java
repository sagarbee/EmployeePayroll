/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.UserLogin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author sagar
 */
public class UserDao {
   
    private Connection connection;

    public UserDao(Connection connection) {
        this.connection = connection;
    }

    public UserLogin getUser(String username, String password, String division) throws SQLException {
        UserLogin user = null;
        String sql = "SELECT id, username, password, division FROM users WHERE username = ? AND password = ? AND division = ?";
        
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.setString(3, division);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    user = new UserLogin();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setDivision(rs.getString("division"));
                }
            }
        }
        
        return user;
    } 
}
