package com.cistech.batch32.week4.src;

import java.util.ArrayList;
import java.util.List;

public class RemoveObject {
	
	String firstName;
	String lastName;
	float GPA;
	
	

	public RemoveObject(String firstName, String lastName, float gPA) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		GPA = gPA;
	}
	
	



	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public float getGPA() {
		return GPA;
	}





	public void setGPA(float gPA) {
		GPA = gPA;
	}
	
	



	@Override
	public String toString() {
		return "RemoveObject [firstName=" + firstName + ", lastName=" + lastName + ", GPA=" + GPA + "]";
	}





	public static void main(String[] args) {
		
		List<RemoveObject> list = new ArrayList<RemoveObject>();
		
		list.add(new RemoveObject("Manish","Mapakshi",3.5f));
		list.add(new RemoveObject("Milind","Patil",3.6f));
		list.add(new RemoveObject("Sundar","Santhanam",3.5f));
		
		int lastIndex = list.size()-1;
			
		list.remove(lastIndex);
		
		for(RemoveObject i : list)
		{
			System.out.println(i);
		}
		

	}

}
