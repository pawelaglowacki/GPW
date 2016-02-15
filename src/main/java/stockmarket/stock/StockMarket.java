package stockmarket.stock;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StockMarket {

	private List<Stock> stocks;
	
	public List<Stock> getStocks() {
		return stocks;
	}
	
	public List<Stock> getPastAndTodaysStocks(Date today) {

		List<Stock> stocks = new ArrayList<Stock>();
		for(Stock s : stocks)
		{
			if(!(s.getDate().after(today)))
				stocks.add(s);
		}
		
		return stocks;
	}

	public List<Stock> getTodaysStocks(Date today) {

		List<Stock> stocks = new ArrayList<Stock>();
		for(Stock s : stocks)
		{
			if(!(s.getDate().equals(today)))
				stocks.add(s);
		}

		return stocks;
	}
	
	public void setStocks(List<Stock> stocks) {
		this.stocks = stocks;
	}
 
	public StockMarket() throws FileNotFoundException {

		Scanner scanner = new Scanner(new File("dane.csv"));

		scanner.useDelimiter(",|\\n");
	        
	        String name;
	        double price;
	        String sDate;
	        
	        name = scanner.next();

	        sDate = scanner.next();
	        Date date = new Date(Integer.parseInt(sDate.substring(0,4)), Integer.parseInt(sDate.substring(4,6)), Integer.parseInt(sDate.substring(6,8)));
	        
	        price = Double.parseDouble(scanner.next());
	        
	        Stock stock = new Stock(name,price,date);
	        
	        scanner.close();
	}	
}