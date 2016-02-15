package stockmarket.stock;

import java.util.Date;

public class Stock {

	private String companyName;
	private double price;
	private Date date;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
		
	public Stock(String companyName, double price, Date date) {
		this.companyName = companyName;
		this.price = price;
		this.date = date;
	}
	
	protected Stock() {
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

}
