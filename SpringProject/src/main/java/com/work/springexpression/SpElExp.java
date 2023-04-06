package com.work.springexpression;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean1")
public class SpElExp {
	
	@Value("#{99+63}")
	private int x;
	
	@Value("#{ 88>99 ? 8.5 : 9.6}")
	private double y;
	
	//static method
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double power;

	//static variable
	@Value("#{T(java.lang.Math).PI}")
	private double staticVariable;

	//boolean true or false
	@Value("#{5>3}")
	private boolean i;
	
	//passing object
	@Value("#{new java.lang.String('workspace')}")
	private String StringTypeObjectValue;
	
	
	public String getStringTypeObjectValue() {
		return StringTypeObjectValue;
	}

	public void setStringTypeObjectValue(String stringTypeObjectValue) {
		StringTypeObjectValue = stringTypeObjectValue;
	}

	public boolean isI() {
		return i;
	}

	public void setI(boolean i) {
		this.i = i;
	}

	public double getStaticVariable() {
		return staticVariable;
	}

	public void setStaticVariable(double staticVariable) {
		this.staticVariable = staticVariable;
	}
	
	public int getX() {
		return x;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
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
		return "SpElExp [x=" + x + ", y=" + y + ", power=" + power + ", staticVariable=" + staticVariable + ", i=" + i
				+ ", StringTypeObjectValue=" + StringTypeObjectValue + "]";
	}
	

}
