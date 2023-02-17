package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static void main(String[] args) {
		
		System.out.println(DbConnection.getdb());
	}
	
	public static Connection getdb()
	{
		String url="jdbc:mysql://localhost:3306/breakfast";
		String user="root";
		String password="1234";
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn=DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
		return conn;
		
	}
}
