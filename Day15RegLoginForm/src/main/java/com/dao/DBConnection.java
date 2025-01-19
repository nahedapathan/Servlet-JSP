package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConnection {
	Connection conn;

	public DBConnection() {
		super();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String URL = "jdbc:mysql://localhost:3306/batch194";
			String USER = "root";
			String PASSWORD = "tiger123";
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void registerData(String un, String email,String pw) {
		try {
			String query = "INSERT INTO login VALUES(?,?,?)";

			PreparedStatement pstmt = conn.prepareStatement(query);
		    pstmt.setString(1, un);
		    pstmt.setString(2, email);
		    pstmt.setString(3, pw);
		    
		    int row=pstmt.executeUpdate();
		    if(row>0)
		    {
		    	System.out.println("Data inserted");
		    }
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void LoginData(String name, String password) {
		String query="SELECT * FROM logi";
		
	}

}
