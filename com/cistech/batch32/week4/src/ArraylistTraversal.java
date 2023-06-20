package com.cistech.batch32.week4.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistTraversal {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		
		strings.add("apple");
		strings.add("mango");
		strings.add("orange");
		strings.add("banana");
		strings.add("grapes");
		
		// traversal using for loop
		
		for(Integer i = 0; i < strings.size(); i++)
		{
			System.out.print(strings.get(i) + " ");
		}
		System.out.println("\n XXXXXXXXXXXXXXXXXx");
		
		// traversal using enhanced for loop
		
		for(String s : strings)
		{
			System.out.print(s + " ");
		}
		System.out.println("\n XXXXXXXXXXXXXXXXXx");
		
		// Traversal using for each loop
		
		strings.forEach(s -> System.out.print(s + " "));
		System.out.println("\n XXXXXXXXXXXXXXX");
		
		// Traversal using Iterator
		
		Iterator i = strings.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
		}
		System.out.println("\n XXXXXXXXXXXXXXXXXx");
		
		// Traversal using parallel stream
		
		strings.parallelStream()
		.forEach(s -> System.out.print(s + " "));

	}

}
