package com.cistech.batch32.week4.src;

import java.util.ArrayList;
import java.util.List;

public class ArraylistToArray {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		
		strings.add("apple");
		strings.add("mango");
		strings.add("grapes");
		strings.add("orange");
		
		String [] fruits = (String[]) strings.toArray(new String[3]);
		
		for(String s : fruits)
		{
			System.out.println(s);
		}

	}

}
