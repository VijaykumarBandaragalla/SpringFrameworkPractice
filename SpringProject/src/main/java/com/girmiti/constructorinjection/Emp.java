package com.girmiti.constructorinjection;

public class Emp {
	
	private String empname;
	private int eid;
	private double esal;
	private Dept dept;
	
	
	@Override
	public String toString() {
		return "Emp [empname=" + empname + ", eid=" + eid + ", esal=" + esal + ", dept=" + dept + "]";
	}
	
	
	public Emp(String empname, int eid, double esal, Dept dept) {
		super();
		this.empname = empname;
		this.eid = eid;
		this.esal = esal;
		this.dept = dept;
	}
	
	

}
