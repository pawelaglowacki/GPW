package stockmarket.stock;

import java.util.Date;
import java.util.List;

public class BrokerageOffice {

	private Date today;
	private StockMarket stockMarket;

	public BrokerageOffice(Date today, StockMarket stockMarket) {
		this.today = today;
		this.stockMarket = stockMarket;

	}

	public List<Stock> getStocks() {
		return stockMarket.getPastAndTodaysStocks(today);
	}

	private double pricePlusCommision(double price) {
		double commision = price * 0.05;
		if (commision < 5)
			commision = 5;

		return (commision + price);
	}

	private double priceMinusCommision(double price) {
		double commision = price * 0.05;
		if (commision < 5)
			commision = 5;

		return (commision - price);
	}

	public List<Stock> getTodaysStocks() {
		return stockMarket.getTodaysStocks(today);
	}

	public Stock buyStock(double price, String companyName) {
		List<Stock> stocks = getTodaysStocks();
		Stock stock = null;

		for (Stock s : stocks) {
			if (s.getCompanyName().equals(companyName)) {
				if (pricePlusCommision(price) == s.getPrice())
					stock = s;
			}
		}

		return stock;
	}

	public double sellStock(Stock stockToSell) {
		List<Stock> stocks = getTodaysStocks();
		double price = 0;
		
		for(Stock s : stocks) {
			if(s.equals(stockToSell)) {
			price = priceMinusCommision(s.getPrice()); 
			}
		}
		
		return price;
	}
}