package core;

import java.util.ArrayList;

import dataAccess.Models.*;

public interface ProductService {
	
	boolean addProducts(Product p);
	boolean deleteProducts(Product p);
	ArrayList<String> getProducts(Product p);
	

}
