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
			String connectionUrl = "jdbc:sqlserver://localhost\\SAHIL\\SQLEXPRESS:1433;databasename=Supermarket" ;
	        dbConnection = DriverManager.getConnection(connectionUrl,"Sahil","sahil123");
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
