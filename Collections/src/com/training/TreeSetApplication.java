package com.training;

import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;

public class TreeSetApplication {

	public static void main(String[] args) {

		Student ram = new Student(101, "anand", 78);
		Student shyam = new Student(102, "basky", 68);
		Student magesh = new Student(103, "charu", 88);
		Student chinnaMagesh = new Student(103, "charu", 88);
		
		TreeSet<Student> set = new TreeSet<>();
		
		set.add(chinnaMagesh);
		set.add(magesh);
		set.add(shyam);
		set.add(ram);
		
		for(Student eachStudent:set) {
			
			System.out.println(eachStudent.getFirstName());
		}
	}

}
