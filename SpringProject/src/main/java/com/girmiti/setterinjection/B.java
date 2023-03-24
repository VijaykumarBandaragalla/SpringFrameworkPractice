package com.girmiti.setterinjection;

public class B {
	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

	private int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
