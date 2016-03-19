package dataAccess.Repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dataAccess.Models.Product;

public class SalesRepository extends BaseRepository {
	
	public int insertSales(float totalPrice) throws SQLException
	{
		String query="insert into Sales values('" +totalPrice + "', GETDATE())";
		Statement statement = dbConnection.createStatement();
		
		statement.execute(query);
		
		String identityQuery = "SELECT @@IDENTITY AS 'Identity'";
		
		ResultSet result = statement.executeQuery(identityQuery);
		result.next();
		
		return Integer.parseInt(result.getString("Identity"));		
	}
	
	public void insertSalesDetail(int salesId, Product product) throws SQLException {
		
		String query="insert into SalesDetail values('" +salesId + "', '" +product.productId + "','"+product.quantity +"','"+product.price+"','"+product.price*product.quantity+ "')";
		Statement statement = dbConnection.createStatement();
		
		statement.execute(query);
		
	}
}
