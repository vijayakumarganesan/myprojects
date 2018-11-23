/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */

import java.sql.Connection;
import java.sql.*;
public class dbconnect {
    Connection con;
    public Connection connect()
    {
        try
           
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/datas","root","");
        return con;      
                    
    }
            catch(ClassNotFoundException | SQLException e)
                    {
                    System.out.println(e);
                    return null;
                    } 
        }
    }
       
    
    
    

