package com.cistech.batch32.week3.src;

public class ThreadUsingRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<=100; i++)
		{
			System.out.println(i);
		}
		
	}

}
