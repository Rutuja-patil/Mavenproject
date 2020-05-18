package com.rutuja.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.rutuja.model.Test;

public class ServletDao {
	
	public Test getdata(int rno)
	{
		Test t=new Test();
		/*t.setRno(1);
		t.setName("Rutuja");
		t.setEmail("r@gmail.com");
		t.setPhno("123456");
		*/
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from servlet where rno="+rno);
			if(rs.next())
			{
				t.setRno(rs.getInt("rno"));
				t.setName(rs.getString("name"));
				t.setEmail(rs.getString("email"));
				t.setPhno(rs.getString("phno"));
			
			}
			
			
			
			
		}
		
		catch(Exception e)
		{
			
			System.out.println(e);
			
		}
		
		return t;
		
		
		
	
	}

}
