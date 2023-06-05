package com.cistech.batch32.week2.src;

public class StaticExample {
	
	public static int staticVariable;
	
	public static int staticMethod(int staticVariable) {
		
		System.out.println(staticVariable);
		
		return staticVariable * 10;
	}
	
	static {
		
		StaticExample.staticMethod(20);
	}

}
