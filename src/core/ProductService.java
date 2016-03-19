//
//package core;
//
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//import dataAccess.Models.*;
//import dataAccess.Repositories.EmployeeRepository;
//import dataAccess.Repositories.ProductRepository;
//
//public class ProductService {
//	
//	private ProductRepository productRepository;
//	
//	public ProductService() {
//		productRepository = new ProductRepository();
//	}
//
//	
//	boolean addProducts(Product p) throws Exception
//	{
//		try{
//			productRepository.addProducts(p);
//			return true;
//			
//		}catch(SQLException e)
//		{
//			throw new Exception("Failed.");
//		}
//	}
//	
//	boolean deleteProducts(Product p) throws Exception
//	{
//		try{
//			productRepository.deleteProducts(p);
//			return true;
//			
//		}catch(SQLException e)
//		{
//			throw new Exception("Failed.");
//		}
//		
//	}
//	
//	ArrayList <Product> getProducts() throws Exception
//	{
//		try{
//			return productRepository.getProducts();
//			
//		}catch(SQLException e)
//		{
//			throw new Exception("Failed.");
//		}
//	
//	
//	}
//	public static void main(String[] args) {
//		ProductService productService = new ProductService();
//		
//		try {
////			Product p  = new Product();			
////			p.name = "xx";
////			p.price = 25;
////			p.quantity = 5;
////			p.vendorId = 552343;
////			
////		
////			Product p2  = new Product();			
////			p2.name = "Sex Toys";
////			p2.price = 1000;
////			p2.quantity = 2;
////			p2.vendorId = 502343;
////		
////		
////			productService.addProducts(p);
////			productService.addProducts(p2);
////	
//		
////			System.out.println("Product created");
////			
////			Product p=new Product();
////			p.name="xx";
////			
////			productService.deleteProducts(p);
////			System.out.println("Product Deleted");
//			
//			ArrayList<Product>result=productService.getProducts();
//			for(Product p:result)
//			{
//				System.out.println(p);
//			}
//			
////			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//	}
//	
//}
//
//	//boolean deleteProducts(Product p);
//	//ArrayList<String> getProducts(Product p);
//	
