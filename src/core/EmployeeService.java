package core;

import java.util.ArrayList;

import dataAccess.Models.*;

public interface EmployeeService {
	
	boolean addEmployee(Employee e);
	Employee login(EmployeeLogin l);
	ArrayList<String> getEmployee(Employee e);
	

}
