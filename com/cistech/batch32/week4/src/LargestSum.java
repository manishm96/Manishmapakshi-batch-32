package com.cistech.batch32.week4.src;

import java.util.HashMap;
import java.util.Map.Entry;

public class LargestSum {

	public static void main(String[] args) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		int [] input = {10,20,30,40,50,60};
		int target = 100;
		
		for(int i = 0; i < input.length-1; i++)
		{
			for(int j = i+1; j < input.length; j++)
			{
				if(input[j] == target - input[i])
				{
					//System.out.println(i);
					//System.out.println(j);
					map.put(i, input[i]);
					map.put(j, input[j]);
				}
			}
		}
		System.out.println("The indexes matching the target of 100 are:");
		
		for(Entry<Integer,Integer> e : map.entrySet())
		{
		    System.out.println("key :" + e.getKey() + " " + "value:" + e.getValue());
		}
		
		

	}

}
