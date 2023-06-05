package com.cistech.batch32.week2.src;

public class Child extends Parent {
	
	private int childVar;

	public Child(int childVar, int parentVar) {
		super(parentVar);
		this.childVar = childVar;
	}
	
	public Child(int childVar) {
		super(0);
		this.childVar = childVar;
	}
	
}
