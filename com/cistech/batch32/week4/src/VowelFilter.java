package com.cistech.batch32.week4.src;

import java.util.Arrays;

public class VowelFilter {

	public static void main(String[] args) {
		
		String[] strings = {"apple", "banana", "cat", "dog", "elephant"};

        Arrays.stream(strings)
                .filter(str -> str.matches(".*[aeiou].*"))
                .forEach(str -> {
                    int vowelCount = (int) str.chars()
                            .filter(ch -> "aeiou".indexOf(ch) != -1)
                            .count();
                    System.out.println("String: " + str + ", Vowel Count: " + vowelCount);
                });

	}

}
