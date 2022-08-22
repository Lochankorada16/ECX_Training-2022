
package com.training;

import java.util.*;
import com.training.model.Student;

public class HashMapApp2 {

	public static void main(String[] args) {

		Student ram = new Student (101,"anand",78);
		Student shyam = new Student(102,"basky",68);
		Student mukesh = new Student(103,"mukesh",78);
		
		HashMap<Integer, Student> map = new HashMap<>();
		
		map.put(900, ram);
		map.put(902, shyam);
		map.put(904, mukesh);
		
//		System.out.println(map.get(900));
//		System.out.println(map.get(902));
//		System.out.println(map.get(904));
		
		System.out.println("=======Using only key============");
		
		Set<Integer> keys = map.keySet(); //set key
		// All the keys will be stored in the keys(object)
		
		for (Integer key : keys) {
			System.out.println(map.get(key));
		}
		
		System.out.println("\n=======Using only values=========");
		
		Collection<Student> list = map.values(); //set value
		
		for (Student eachList : list) {
			System.out.println(eachList);
		}
		
		System.out.println("\n=======Using both key and values=========");
		
		Set<Map.Entry<Integer, Student>> list2 = map.entrySet(); //set key and value
		
		for(Map.Entry<Integer, Student> eachEntry : list2) {
			
			System.out.println(eachEntry.getKey());
			System.out.println(eachEntry.getValue());
		}
	}

}
