package com.tka.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.model.user;

public class userService {

	public void insert(String name,int age,String address,String moNum)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch191","root","tiger");
			String query="INSERT INTO user VALUES(?,?,?,?)";
			
			PreparedStatement pstmt=conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, address);
			pstmt.setString(4, moNum);
			
			pstmt.executeUpdate();
			
			pstmt.close();
			conn.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public List<user> getAllRecord() {
		try {
			
			List<user> users=new ArrayList<user>();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch191","root","tiger");
			Statement stmt=conn.createStatement();
			
			String query="SELECT * FROM USER";
			
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next())
			{
				user user1=new user(rs.getString("name"),rs.getInt("age"),rs.getString("address"),rs.getString("moNum"));
				users.add(user1);
			}
			return users;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
