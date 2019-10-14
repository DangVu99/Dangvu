/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDatabase {
	
	public static Connection getConnection() {
		Connection conn = null;
		
	    String sqlInstanceName = "DESKTOP-TFHBE5C\\SQLEXPRESS:1433";
	    String database = "QLSV";
		
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + sqlInstanceName + ";databaseName=" + database;
        
        try{
        	conn = DriverManager.getConnection(connectionUrl); 
        	
        	if (conn != null) {
                System.out.println("Connected");
            }else {
            	System.out.println("Khong ket noi duoc voi database");
            }
        	
            return conn;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Khong ket noi duoc voi database");
            return conn;
        }
    }
}
