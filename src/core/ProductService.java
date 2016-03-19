
package core;

import java.sql.SQLException;
import java.util.ArrayList;
import dataAccess.Models.*;
import dataAccess.Repositories.ProductRepository;

public class ProductService {
	
	private ProductRepository productRepository;
	
	public ProductService() {
		productRepository = new ProductRepository();
	}

	boolean addProducts(Product p) throws Exception
	{
		try {
			productRepository.addProducts(p);
			return true;
		}
		catch(SQLException e)
		{
			throw new Exception("Failed.");
		}
	}
	
	boolean deleteProducts(Product p) throws Exception
	{
		try {
			productRepository.deleteProducts(p);
			return true;
		}
		catch(SQLException e)
		{
			throw new Exception("Failed.");
		}
		
	}
	
	ArrayList <Product> getProducts() throws Exception
	{
		try {
			return productRepository.getProducts();
		}
		catch(SQLException e)
		{
			throw new Exception("Failed.");
		}
	}
}
