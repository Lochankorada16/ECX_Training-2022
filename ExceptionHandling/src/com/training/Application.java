package com.training;

import com.training.exception.RangeCheckException;
import com.training.model.Student;
import com.training.services.ExceptionHandling;
import com.training.services.StudentService;

public class Application {

	public static void main(String[] args) throws RangeCheckException {
		// TODO Auto-generated method stub

		Student ram = new Student(1010, "Lochan", -97);
		
		StudentService service = new StudentService(ram);
		
		System.out.println(service.sendDetails());
		
		StudentService service2 = new StudentService();
		
		try {
			System.out.println(service2.findRank());
		} catch (Exception e) {
			
//			e.printStackTrace();
			System.err.println("Name is not passed");
		}
		ExceptionHandling exHandling = new ExceptionHandling();
		exHandling.usingArrayIndexException(args);
	
		exHandling.usingNumberFormatException("45");
		
	}
}
