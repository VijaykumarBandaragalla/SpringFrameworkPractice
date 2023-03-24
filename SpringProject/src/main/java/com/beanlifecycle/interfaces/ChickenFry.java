package com.beanlifecycle.interfaces;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ChickenFry {
	
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

//	public void afterPropertiesSet() throws Exception {
//		System.out.println("collecting resources to prepare fried chicken");
//		
//	}
//
//	public void destroy() throws Exception {
//		System.out.println("we ate the fried chicken....!!!!");
//	}
	
	//it performs same operation as of init()
	@PostConstruct
	public void start() {
		System.out.println("started preparing ");
	}
	@PreDestroy
	public void stop() {
		System.out.println("ended");
	}
}
