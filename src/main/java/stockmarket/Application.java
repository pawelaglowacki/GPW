package stockmarket;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

import stockmarket.stock.StockMarket;
import stockmarket.strategies.RandStrategy;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		
		StockMarket stockMarket = new StockMarket();
		Player player1 = new Player(new RandStrategy()); 
	}
}