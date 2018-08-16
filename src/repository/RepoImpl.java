package repository;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jda.model.User;

public class RepoImpl {
	private java.sql.Connection connect = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private Statement statement = null;
	
	public void readDataBase(User user) throws Exception {
		try {
			
			System.out.println("repoaisitory  User  : "  +user);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			connect = DriverManager.getConnection("jdbc:mysql://10.0.0.160/db1000122" ,System.getenv("DBUSER"), System.getenv("DBPASSWORD"));

			preparedStatement = connect
			      .prepareStatement("insert into  db1000122.user values (?, ?, ?, ? )");
			
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getUserName());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setString(4, user.getMobile());
			//preparedStatement.addBatch();
			preparedStatement.executeUpdate();
			//preparedStatement.executeBatch();
			System.out.println("Done");

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}
	
	public boolean auhtorization(String  userName,String password) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	
		//connect = DriverManager.getConnection("jdbc:mysql://10.0.0.160/db1000122?", "u1000122","gxVmK71i2j");
		connect = DriverManager.getConnection("jdbc:mysql://10.0.0.160/db1000122" ,System.getenv("DBUSER"), System.getenv("DBPASSWORD"));
	  statement = (Statement) connect.createStatement();	
	  resultSet=((java.sql.Statement) statement).executeQuery(" select * from  db1000122.user where username='"+userName+"';");
     if(resultSet.next())
     {
     if(resultSet.getString(3).equals(password) && resultSet.getString(2).equals(userName))
     {
   	  System.out.println("pasword and user name matched");
   	  return true;
     }
     else
     {
   	  System.out.println("password  or username mismatched");
   	  return false;
     }
     }
     return false;
     
		
     
     }
    
     
		
	
	
	
	

	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}

			if (statement != null) {
				((java.sql.Statement) statement).close();
			}

			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {

		}
	}
}




