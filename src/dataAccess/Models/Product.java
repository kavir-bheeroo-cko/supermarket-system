package dataAccess.Models;

public class Product {
	
	public int productId;
	public String name;
	public float price; 
	public int quantity; 
	public int vendorId;

	public String toString()
	{
		return productId+" "+name+" "+price+" "+quantity+" "+vendorId;
	}
}
