package dataAccess.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dataAccess.Models.*;

public class EmployeeRepository extends BaseRepository {

	public EmployeeLogin verifyLogin(String userName, String password) throws SQLException {
		
		String query = "select * from Employee where userName = '" + userName + "' and password = '" + password + "'";
		Statement statement = dbConnection.createStatement();
		
		ResultSet result = statement.executeQuery(query);
		
		EmployeeLogin employeeLogin = new EmployeeLogin();
		
		employeeLogin.loginId = result.getInt("LoginId");
		employeeLogin.employeeId = result.getInt("EmployeeId");
		employeeLogin.accessRightId = result.getInt("AccessRightId");
		employeeLogin.username = result.getString("Username");
		employeeLogin.password = result.getString("Password");

		return employeeLogin;
	}
}
