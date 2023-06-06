package com.cistech.batch32.week2.src;

public class Age {
	
	public static void ageGroup(int age)
	{
		if(age >= 13 && age <= 19)
		{
			System.out.println("The person is a teen.");
		}
		else if(age < 13)
		{
			System.out.println("The person is a kid.");
		}
		else {
			
			System.out.println("The person is an adult.");
		}
	}

	public static void main(String[] args) {
		
		Age.ageGroup(65);

	}

}
