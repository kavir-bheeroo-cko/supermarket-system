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
	
	//boolean addEmployee(Employee e);
	EmployeeLogin verifyLogin(String username, String password) throws Exception {
		
		try {
			return employeeRepository.verifyLogin(username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new Exception("Login failed.");
		}
	}
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		try {
			EmployeeLogin employeeLogin = employeeService.verifyLogin("", "");
			System.out.println(employeeLogin.username + " has logged in.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	//ArrayList<String> getEmployee(Employee e);
}
