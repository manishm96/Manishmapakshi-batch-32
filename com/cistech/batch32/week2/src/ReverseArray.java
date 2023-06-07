package com.cistech.batch32.week2.src;

public class ReverseArray {
	
	public static void reverse(int [] array, int length)
	{
		int [] copyArray = new int[length];
		int j = length;
		
		for(int i = 0; i < length; i++)
		{
			copyArray[j-1] = array[i];
			j--;
		}
		
		for(int k = 0; k < copyArray.length; k++)
		{
			System.out.println(copyArray[k]);
		}
	}

	public static void main(String[] args) {
		
		int [] array = {3, 7, 34, 77, 91, 82, 121, 11};
		int length = array.length;
		
		ReverseArray.reverse(array, length);
		
		
		

	}

}
