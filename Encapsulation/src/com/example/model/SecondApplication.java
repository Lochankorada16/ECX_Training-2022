package com.example.model;

public class SecondApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student shyam = new Student();
		
		shyam.setRollNumber(1010);
		shyam.setMarkScored(56);
		shyam.setFirstName("Shyam");
		
	//	shyam.setBranch("B.Tech");
		
		System.out.println("Roll Number :="+shyam.getRollNumber());
		System.out.println("Mark Scored :="+shyam.getMarkScored());
		System.out.println("Student Name :="+shyam.getFirstName());
		
	}

}
