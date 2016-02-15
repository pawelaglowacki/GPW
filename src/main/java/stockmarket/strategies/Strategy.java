package stockmarket.strategies;

import stockmarket.StocksInWallet;
import stockmarket.stock.Stock;

public interface Strategy {
	
	Action decide();
}