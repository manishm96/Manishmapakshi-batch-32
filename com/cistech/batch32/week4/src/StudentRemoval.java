package com.cistech.batch32.week4.src;

import java.util.ArrayList;
import java.util.List;

public class StudentRemoval {
	
	public static List<Student> getStudents()
	{
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student("Manish","Mapakshi",3.5f));
		list.add(new Student("Milind","Patil",3.0f));
		list.add(new Student("Aakash","Ganjoo",3.2f));
		
		return list;
	}

	public static void main(String[] args) {
		
		List<Student> outputList = new ArrayList<Student>();
		
		double totalGpa = 0;
		
		for(Student s : getStudents())
		{
			totalGpa = totalGpa + s.getGPA();
		}
		
		double average = totalGpa / getStudents().size();
		
		for(Student s : getStudents())
		{
			if(s.getGPA() > average)
			{
				outputList.add(s);
			}
		}
		
		for(Student s : outputList)
		{
			System.out.println(s);
		}

	}

}
