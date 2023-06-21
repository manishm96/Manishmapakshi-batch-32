package com.cistech.batch32.week4.src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentHashmap {

	public static void main(String[] args) {
		
		Student s = new Student("Manish","Mapakshi",3.5f);
		Student s1 = new Student("Milind","Patil",3.6f);
		Student s2 = new Student("Aakash","Ganjoo",3.4f);
		
		HashMap<String,Student> map = new HashMap<String,Student>();
		
		map.put(s.getFirstName(), s);
		map.put(s1.getFirstName(), s1);
		map.put(s2.getFirstName(), s2);
		
		System.out.println(map.entrySet());
		System.out.println("\n XXXXXXXXXXXXXXXXXXXXXXXX");
		
		// Using entry set
		
		for(Map.Entry<String,Student> entry : map.entrySet())
		{
			System.out.println("Key :" + entry.getKey() + " " + "Value :" + entry.getValue());
		}
		System.out.println("\n XXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		// Using for each
		
		map.forEach((k,v) -> System.out.println("key :" + k + " " + "value:" + v));
		
		System.out.println("\n XXXXXXXXXXXXXXXXXXXXXX");
		
		// using key set and iterator
		
		Iterator<String> i = map.keySet().iterator();
		
		while(i.hasNext())
		{
			String k = i.next();
			System.out.println("key :" + k + " " + map.get(k));
		}

	}

}
