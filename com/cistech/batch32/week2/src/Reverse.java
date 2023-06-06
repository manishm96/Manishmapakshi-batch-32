package com.cistech.batch32.week2.src;

public class Reverse {

	public static void main(String[] args) {
		
        int input = 12345;
		
		int rev = 0;
		
		while(input != 0) {
			
			rev = (rev * 10) + (input % 10);
			input = input/10;
		  }
		
		 System.out.println(rev);

	}

}
