package com.cistech.batch32.week3.src;

public class StringToInt {
	
	public static int toInt(String s) throws IllegalArgumentException {
		
		if(s instanceof String) {
			
			Integer i = Integer.valueOf(s);
			
			return i;
		}else {
			
			throw new IllegalArgumentException();
			
		}
		
	}

	public static void main(String[] args) {
		
		try {
			
			System.out.println(StringToInt.toInt("23"));
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
