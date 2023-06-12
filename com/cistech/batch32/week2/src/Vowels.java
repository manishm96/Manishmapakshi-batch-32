package com.cistech.batch32.week2.src;

public class Vowels {
	
	public static void findVowels(String s)
	{
		char [] chars = s.toCharArray();
		int count = 0;
		
		for(int i = 0; i < chars.length; i++)
		{
			if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u')
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Vowels.findVowels("Batman");

	}

}
