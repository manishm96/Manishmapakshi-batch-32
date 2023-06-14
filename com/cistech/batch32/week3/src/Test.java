package com.cistech.batch32.week3.src;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadClass t = new ThreadClass();
		ThreadUsingRunnable r = new ThreadUsingRunnable();
		Thread t1 = new Thread(r);
		
		//t.start();
		t1.start();
	}

}
