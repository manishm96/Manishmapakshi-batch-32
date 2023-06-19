package com.cistech.batch32.week4.src;

import java.util.Arrays;

public class AverageOfOddSquare {

	public static void main(String[] args) {
		
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		double average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0) 
                .mapToDouble(n -> Math.pow(n, 2)) 
                .average()
                .orElse(0);
		
		
		System.out.println(average);

	}

}
