package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

//import java.sql.SQLException;

public class DBConnection {
	private static Connection con = null;
	
	public static Connection GetConnection() 
    {
        try {
            /*String userName = "root";
            String password = "Rbabama10*";
            String url = "jdbc:mysql://localhost:3306/xenonstack";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,userName,password);
            */
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctor_pataint_app","root","Rbabama10*");
        	System.out.println("Database connection established");
        } 
        catch (Exception e){
        	System.out.println("Connection Fail");
        	e.printStackTrace();
        }
        return con;
    }
}
