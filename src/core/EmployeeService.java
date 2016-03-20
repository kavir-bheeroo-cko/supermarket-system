package core;

import java.sql.SQLException;
import java.util.ArrayList;
import dataAccess.Models.*;
import dataAccess.Repositories.EmployeeRepository;

public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService() {
		employeeRepository = new EmployeeRepository();
	}
	
	public EmployeeLogin verifyLogin(String username, String password) throws Exception {
		
		try {
			return employeeRepository.verifyLogin(username, password);
		}
		catch (SQLException e) {
			throw new Exception("Login failed.");
		}
	}
	
	boolean addEmployee(Employee employee) throws Exception
	{
		try {
			employeeRepository.addEmployee(employee);
			return true;
		}
		catch(SQLException e)
		{
			throw new Exception("Failed.");
		}
	}
	
	ArrayList <Employee> getEmployees() throws Exception
	{
		try {
			return employeeRepository.getEmployees();
		}
		catch(SQLException e)
		{
			throw new Exception("Failed.");
		}
	}
}
