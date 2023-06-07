package com.cistech.batch32.week2.src;

public class MaxAndMinArray {

	public static void main(String[] args) {
		
		int [] array = {5,3,84,91,66,11};
		int max = 0;
		int min = 0;
		
		for(int i=0; i < array.length; i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		
		for(int i = 0; i < array.length; i++)
		{
			
			if(i == 0)
			{
				min = array[i];
			}
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		
		System.out.println("maximum value in the array is:" + " " + max);
		System.out.println("minimum value in the array is:" + " " + min);

	}

}
