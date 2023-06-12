package com.cistech.batch32.week2.src;

import java.util.Arrays;

public class IsAnagram {
	
	public static boolean checkAnagram(String s, String s1)
	{
		char [] chars1 = s.toCharArray();
		char [] chars2 = s1.toCharArray();
		
		if(chars1.length != chars2.length)
		{
			return false;
		}
		
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		
		for(int i = 0; i < chars1.length; i++)
		{
			if(chars1[i] != chars2[i])
			{
				return false;
			}
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		
		if(IsAnagram.checkAnagram("brag", "grab"))
		{
			System.out.println("It is an anagram!");
		}else {
			System.out.println("It is not an anagram!");
		}

	}

}
