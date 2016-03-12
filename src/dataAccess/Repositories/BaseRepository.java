package dataAccess.Repositories;

import java.sql.*;

public class BaseRepository {

	public Connection dbConnection;
	
	public BaseRepository() {
		connect();
	}
	
	public void connect() {
		try
	    {
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        String connectionUrl = "jdbc:sqlserver://servername;databaseName=employee;user=username;password=''/*since it is windows authentication*/;";
	        dbConnection = DriverManager.getConnection(connectionUrl);
	    }
	    catch(ClassNotFoundException e)
	    {
	        e.printStackTrace();
	    }
	    catch(SQLException e2)
	    {
	        e2.printStackTrace();
	    }
	}
}
