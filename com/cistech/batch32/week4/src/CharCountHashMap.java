package com.cistech.batch32.week4.src;

import java.util.HashMap;
import java.util.Map.Entry;

public class CharCountHashMap {

	public static void main(String[] args) {
		
		String input = "test string";
		
		char [] chars = input.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : chars)
		{
			if(c == ' ')
			{
				continue;
			}
			if(map.isEmpty())
			{
				map.put(c, 1);
			}
			
			
			if(!map.containsKey(c))
			{
	
				map.put(c,1);
				
			}else {
				
				map.put(c, map.get(c) + 1);
			}
		}
		
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			System.out.println("key :" + entry.getKey() + " " + "value:" + " " + entry.getValue());
		}

	}

}
