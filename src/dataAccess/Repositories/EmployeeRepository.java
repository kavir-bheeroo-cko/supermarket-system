package dataAccess.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dataAccess.Models.*;

public class EmployeeRepository extends BaseRepository {

	public EmployeeLogin verifyLogin(String userName, String password) throws SQLException {
		
		String query = "select * from EmployeeLogin where Username = '" + userName + "' and Password = '" + password + "'";
		Statement statement = dbConnection.createStatement();
		
		ResultSet result = statement.executeQuery(query);
		
		result.next();
		
		EmployeeLogin employeeLogin = new EmployeeLogin();
		
		employeeLogin.loginId = result.getInt("LoginId");
		employeeLogin.employeeId = result.getInt("EmployeeId");
		employeeLogin.accessRightId = result.getInt("AccessRightId");
		employeeLogin.username = result.getString("Username");
		employeeLogin.password = result.getString("Password");

		return employeeLogin;
	}
	
	public boolean addEmployee(Employee employee) throws SQLException
	{
		String query="insert into Employee values('" +employee.name + "','"+employee.surname +"','"+employee.gender+"','"+employee.address+ "','"+employee.phone+"')";
		Statement statement = dbConnection.createStatement();
		
		statement.execute(query);
		
		return true;
	}
	
	public ArrayList <Employee> getEmployees() throws SQLException
	{
		ArrayList<Employee> employees=new ArrayList<Employee>();
		
		String query="select * from Employee";
		Statement statement = dbConnection.createStatement();
		
		ResultSet result=statement.executeQuery(query);
		
		while(result.next())
		{
			Employee e=new Employee();
			
			e.employeeId=result.getInt("EmployeeId");
			e.name=result.getString("Name");
			e.surname=result.getString("Surname");
			e.gender=result.getString("GENDER");
			e.address=result.getString("Address");
			e.phone=result.getInt("Telephone");
			
			employees.add(e);
		}
		
		return employees;
		
	}
}
