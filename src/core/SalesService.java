package core;

import java.util.ArrayList;

import dataAccess.Models.*;
public interface SalesService {

	ArrayList<String> getOrder(OrderDetails d);
	ArrayList<String> getSalesReport(SalesDetail s);
	ArrayList<String> getVendorReport(Vendor d);
	
}
