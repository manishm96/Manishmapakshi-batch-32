package com.cistech.batch32.week2.src;

public class Fibonacci {
	

	public static void main(String[] args) {
		
		int N =10;
		int n1 = 0;
		int n2 = 1;
		
		for(int i = 1; i<=N; i++)
		{
			System.out.println(n1 + " ");
			
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		

	}

}
