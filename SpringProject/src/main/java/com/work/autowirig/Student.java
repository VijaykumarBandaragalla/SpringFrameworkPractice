package com.work.autowirig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	@Qualifier("certi1")
	@Autowired
	private Certificate certi;
	//constructor with no argument
	public Student() {
	}
	//constructor
	public Student(Certificate certi) {
		this.certi = certi;
		System.out.println("Injectig property using constroctour");
	}

	
	//getters and setters
	public Certificate getCerti() {
		return certi;
	}
//	@Autowired  we can use here also this will be setter annotation
	public void setCerti(Certificate certi) {
		this.certi = certi;
		System.out.println("setting properties using setters");
	}
	@Override
	public String toString() {
		return "Student [certi=" + certi + "]";
	}
	
}
