package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class StudentDao {

	public static boolean InsertStudentsIntoDb(Student st)
	{
		boolean f=false;
		try {
			         //JDBC code
			Connection con=Connection_provider.createConnection();
			String q="insert into students(sname,sphone,scity)values(?,?,?)";
			
			//PreparedStatment
			PreparedStatement pstmt =con.prepareStatement(q);
			
			//set the value of parameter
			
			pstmt.setString(1,st.getStudentName());
			pstmt.setString(2,st.getStudentPhoneNo());
			pstmt.setString(3,st.getStudentCity());
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}

	public static boolean deteleStudent(int userId) {
		
		boolean f=false;
		try {
			         //JDBC code
			Connection con=Connection_provider.createConnection();
			String q="delete from students where sid=?";
			
			//PreparedStatment
			PreparedStatement pstmt =con.prepareStatement(q);
			
			//set the value of parameter
			
			pstmt.setInt(1,userId);
			
			
			//execute
			pstmt.executeUpdate();
			f=true;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;

	}

	public static void ShowAllStudents() {

		boolean f=false;
		try {
			         //JDBC code
			Connection con=Connection_provider.createConnection();
			String q="select * from students;";
			
		    Statement stmt=con.createStatement();
		    
		    ResultSet set=stmt.executeQuery(q);
		    
		    while(set.next())
		    {
		    	int id=set.getInt(1);
		    	String name=set.getString(2);
		    	String phone=set.getString(3);
		    	String city=set.getString("scity");
		    	
		    	System.out.println("Student Id: "+id);
		    	System.out.println("Student Name: "+name);
		    	System.out.println("Student Phone no: "+phone);
		    	System.out.println("Student City: "+city);
		    	System.out.println("+++++++++++++++++++");
		    }
		    
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
		
	}
}
