/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeepayroll;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Sagar
 */
public class db {

    public static Connection java_db(){
    
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/getconnect","root","Pass@123");
        
        return connection;    
         
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
   }
    public static void main(String[] args) {
        db data = new db();
    }
}
