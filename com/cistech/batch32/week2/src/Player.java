package com.cistech.batch32.week2.src;

public class Player implements Action1, Action2 {

	@Override
	public void run() {
		
		System.out.println("Player is running!!");
		
	}

	@Override
	public void play() {
		
		System.out.println("Player is playing");
		
	}

}
