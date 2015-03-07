package model;

import utility.Sellable;

public class Treatment implements Sellable {
	private String name;
	private String currency = "USD";
	private double price = 0;
	
	//Constructor
	public Treatment(String name, String currency, double price) {
		super();
		this.name = name;
		this.currency = currency;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getPrice() {
		if(price < 0){
			throw new IllegalStateException("Animal has a treatment costing less than zero; cannot be!");
		}
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}