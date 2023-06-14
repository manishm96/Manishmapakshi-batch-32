package com.cistech.batch32.week3.src;

public class ThreadClass extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		for(int i=0; i <= 100; i++)
		{
			System.out.println(i);
		}
	}
	
	

}
