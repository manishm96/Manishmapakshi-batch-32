package com.cistech.batch32.week4.src;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStringsCriteria {

	public static void main(String[] args) {
		
		String[] strings = {"apple", "banana", "orange", "grapes"};

        Arrays.stream(strings)
                .sorted(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparingInt((String str) -> str.charAt(str.length() - 1)).reversed()))
                .forEach(System.out::println);

	}

}
