package com.cistech.batch32.week4.src;

import java.util.Arrays;
import java.util.stream.Stream;

public class CapitalizeStrings {

	public static void main(String[] args) {
		
		String [] fruits = {"apple","orange","banana","grapes"};
		
		
		//stream to capitalize the first letter of each string
		
		String []  capitals = Arrays.stream(fruits)
				.map(str -> str.substring(0,1).toUpperCase() + str.substring(1))
				.toArray(String[]::new);
		
		//sorting the capitalized string in ascending order
		
		String [] sortedArray = Arrays.stream(capitals)
				.sorted()
				.toArray(String[]::new);
		
		for(String s : sortedArray)
		{
			System.out.println(s);
		}

	}

}
