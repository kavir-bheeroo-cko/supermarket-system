package dataAccess.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dataAccess.Models.*;

public class ProductRepository extends BaseRepository{
	
	public boolean addProducts(Product p) throws SQLException
	{
		String query="insert into Product values('" +p.name + "','"+p.price +"','"+p.quantity+"','"+p.vendorId+ "')";
		Statement statement = dbConnection.createStatement();
		
		statement.execute(query);
		
		return true;
	}
	
	public boolean deleteProducts(Product p) throws SQLException
	{
		String query="delete from Product where Name='"+p.name+"'";
		
		Statement statement = dbConnection.createStatement();
		
		statement.execute(query);
		
		return true;
	}

	public ArrayList <Product> getProducts() throws SQLException
	{
		ArrayList<Product> products=new ArrayList<Product>();
		
		String query="select * from Product";
		Statement statement = dbConnection.createStatement();
		
		ResultSet result=statement.executeQuery(query);
		
		while(result.next())
		{
			Product p=new Product();
			p.productId=result.getInt("ProductId");
			p.name=result.getString("Name");
			p.price=result.getFloat("Price");
			p.quantity=result.getInt("Quantity");
			p.vendorId=result.getInt("VendorId");
			
			products.add(p);
		}
		
		return products;
		
	}
	
}
