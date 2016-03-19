package core;

import java.util.ArrayList;
import dataAccess.Models.*;
import dataAccess.Repositories.SalesRepository;

public class SalesService {

	private SalesRepository salesRepository;
	
	public SalesService() {
		salesRepository = new SalesRepository();
	}

	void placeOrder(ArrayList<Product> products) throws Exception {
		float totalPrice = 0;
		
		for(Product p : products) {
			totalPrice += p.price * p.quantity;	
		}
		
		int salesId = salesRepository.insertSales(totalPrice);
		
		for (Product product : products) {
			salesRepository.insertSalesDetail(salesId, product);
		}
	}
}
