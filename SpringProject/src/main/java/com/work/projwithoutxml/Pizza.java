package com.work.projwithoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//to make class as a bean we use @Component
@Component("firstPizza")
public class Pizza {
	@Value("Cheese and Corn")
	private String pName;
	@Value("198.67")
	private double pPrice;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	void deliver() {
		System.out.println("deliver pizza fast..!!");
	}
	public Pizza() {
	}
	@Override
	public String toString() {
		return "Pizza [pName=" + pName + ", pPrice=" + pPrice + "]";
	}
}
