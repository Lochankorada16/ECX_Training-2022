package com.training.services;

public class ExceptionHandling {

	public void usingArrayIndexException(String[] args) {
		
		try {
			System.out.println(args[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			System.err.println("Method requires three values to be passed [a,b,c]");
			//e.printStackTrace();
		}
	}
		public void usingNumberFormatException(String value) {
		
		int age=0;
		try {
			age = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.err.println("Fourty five is not accepted instead 45 is accepted");
			//e.printStackTrace();
		}
		
		System.out.println(age);
	}
		public void usingFinallyBlock() {
			int denominator = 0;
			
			try {
				System.out.println(4/denominator);
			} catch (ArithmeticException e) {
				System.err.println("Denominator should be zero");
			}
			System.out.println("Thanks, bye, bye");
		}
}
