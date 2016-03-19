package dataAccess.Models;

public class Employee {
	
	public int employeeId;
	public String name;
	public String surname;
	public String gender;
	public String address;
	public int phone;
	
	public String toString()
	{
		return employeeId+" "+name+" "+surname+" "+gender+" "+address+" "+phone;
	}
}
