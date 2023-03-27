package com.work.autowirig;

public class Certificate {
	
	private String cname;
	private double cDuration;
	
	//constructor
	public Certificate() {
	}
	
	//getters and setters
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getcDuration() {
		return cDuration;
	}
	public void setcDuration(double cDuration) {
		this.cDuration = cDuration;
	}
	@Override
	public String toString() {
		return "Certificate [cname=" + cname + ", cDuration=" + cDuration + "]";
	}
}
