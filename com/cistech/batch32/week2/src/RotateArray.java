package com.cistech.batch32.week2.src;

public class RotateArray {
	
	public static void rotate(int [] arr, int x)
	{
		for(int j =0; j < x; j++)
		{
			int k;
			int first;
			
			first = arr[0];
			
			for(k = 0; k < arr.length-1; k++)
			{
				arr[k] = arr[k+1];
			}
			
			arr[k] = first;
		}
		
		System.out.println();
		System.out.println("The left rotated array is :");
		
		for(int z = 0; z < arr.length; z++)
		{
			System.out.print(arr[z]);
		}
		
	}

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7};
		int x = 2;
		
		System.out.println("Original array:");
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		
		RotateArray.rotate(arr, x);

	}

}
