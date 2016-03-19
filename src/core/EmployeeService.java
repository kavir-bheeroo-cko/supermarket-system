package core;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
	
	boolean addEmployee(Employee employee) throws Exception
	{
		try{
			employeeRepository.addEmployee(employee);
			return true;
		}catch(SQLException e)
		{
			throw new Exception("Failed.");
		}
	}
	
	 ArrayList <Employee> getEmployees() throws Exception
	{
		try{
			return employeeRepository.getEmployees();
			
		}catch(SQLException e)
		{
			throw new Exception("Failed.");
		}
		
	
		
	}
	
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		try {
			EmployeeLogin employeeLogin = employeeService.verifyLogin("ls9", "vad2");
			System.out.println(employeeLogin.username + " has logged in.");
		
//			Employee e = new Employee();
//			e.name = "xx";
//			e.surname = "asdfs";
//			e.gender = "Mafwele";
//			e.address = "LewfFC";
//			e.phone = 552343;
//			
//			employeeService.addEmployee(e);
//			
//			System.out.println("Employee created");
//			
//			ArrayList<Employee>result=employeeService.getEmployees();
//			for(Employee e:result)
//			{
//				System.out.println(e);
//			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	
}
