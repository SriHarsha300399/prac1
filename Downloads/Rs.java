package com.mysqldatabase;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.*;

public class Rs {

	public static void main(String []args )throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mytestdb","root","root");
		PreparedStatement ps=(PreparedStatement) con.prepareStatement("insert into emp 130 values(?,?,?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("enter id");
			int i=Integer.parseInt(br.readLine());
			System.out.println("enter name");
			String name=br.readLine();
			System.out.println("enter salary");
			float salary =Float.parseFloat(br.readLine());
					
					int id = 0;
					ps.setInt(1,id);
			ps.setString(2,name);
			ps.setFloat(3, salary);
			int i1=ps.executeUpdate();
			System.out.println(i1+"recordsAffected");
			
			System.out.println("do u want to continue: y/n");
			String  s=br.readLine();
			if(s.startsWith("n")) {
				break;
			}
		}while(true) ;
			con.close();
		}
				
			}


		
		
	


