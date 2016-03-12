package core;

public interface Engine {

	boolean addEmployee(String name,String surname,String gender,String address,int phone);
	boolean login(String username,String password);
	boolean addProducts(String name,float price,int quantity);
}
