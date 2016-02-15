package stockmarket;

import java.util.ArrayList;
import java.util.List;

public class StocksInWallet {

	private String stockName;
	private int numberOfStocks;
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfStocks() {
		return numberOfStocks;
	}
	public void setNumberOfStocks(int numberOfStocks) {
		this.numberOfStocks = numberOfStocks;
	}
	
	public StocksInWallet(String stockName, int numberOfStocks) {
		this.stockName = stockName;
		this.numberOfStocks = numberOfStocks;
	}

	public StocksInWallet() {
	}
	
}