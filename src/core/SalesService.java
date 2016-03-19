//package core;
//
//import java.util.ArrayList;
//
//import dataAccess.Models.*;
//import dataAccess.Repositories.EmployeeRepository;
//import dataAccess.Repositories.ProductRepository;
//import dataAccess.Repositories.SalesRepository;
//
//
//public class SalesService {
//
//private SalesRepository salesRepository;
//	
//	public SalesService() {
//		salesRepository = new SalesRepository();
//	}
//
//	void placeOrder(ArrayList<Product> products) throws Exception {
//		float totalPrice = 0;
//		
//		for(Product p : products) {
//			totalPrice += p.price * p.quantity;	
//		}
//		
//		int salesId = salesRepository.insertSales(totalPrice);
//		
//		for (Product product : products) {
//			salesRepository.insertSalesDetail(salesId, product);
//		}
//	}
//	
//	//ArrayList<String> getSalesReport(SalesDetail s);
//	//ArrayList<String> getVendorReport(Vendor d);
//	public static void main(String[] args) throws Exception
//	{
//		SalesService salesService = new SalesService();
//		ArrayList<Product>products=new ArrayList<Product>();
//		
//		Product p=new Product();
//		p.productId=8;
//		p.price=30;
//		p.quantity=2;
//		products.add(p);
//		
//		Product p2=new Product();
//		p2.productId=9;
//		p2.price=50;
//		p2.quantity=1; 
//		products.add(p2);
//		
//		salesService.placeOrder(products);
//		System.out.print("Ordered");
//		
//		
//	}
//
//	
//}
