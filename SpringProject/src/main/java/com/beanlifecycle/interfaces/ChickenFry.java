package com.beanlifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ChickenFry implements InitializingBean ,DisposableBean{
	private double cost;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("setting cost of fried chicken ");
	}

	@Override
	public String toString() {
		return "ChickenFry [cost=" + cost + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("collecting resources to prepare fried chicken");
		
	}

	public void destroy() throws Exception {
		System.out.println("we ate the fried chicken....!!!!");
	}
	
}
