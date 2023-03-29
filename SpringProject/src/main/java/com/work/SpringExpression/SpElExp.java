package com.work.SpringExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean1")
public class SpElExp {
	
	@Value("#{99+63}")
	private int x;
	
	@Value("#{ 88>99 ? 8.5 : 9.6}")
	private double y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	public SpElExp() {
	}

	@Override
	public String toString() {
		return "SpElExp [x=" + x + ", y=" + y + "]";
	}
	

}
