package stockmarket;

import java.util.ArrayList;
import java.util.List;

import stockmarket.strategies.Strategy;

public class Player {

	private double walletPLN;
	private List<StocksInWallet> stocks;
	private Strategy strategy;
	
	public Player(Strategy strategy) {
		this.walletPLN = 10000;
		this.stocks = new ArrayList<StocksInWallet>();
		this.strategy = strategy;
	}
}