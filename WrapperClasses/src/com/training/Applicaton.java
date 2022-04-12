package com.training;


public class Applicaton {

	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		
//		System.out.println(args[1]);
//		
//		System.out.println(args[2]);
//		
//		int value = Integer.parseInt(args[0]);
//		
//		System.out.println(++value);
		
		CurrencyConverter conv = new CurrencyConverter();
		
		double value = Double.parseDouble(args[0]);
		
		System.out.println(conv.inrToUsd(value));
		
		double inrValue = Double.parseDouble(args[1]);
		
		System.out.println(conv.inrToEuro(inrValue));
		
		double salary = 42500.00;
		
		int intSal = (int) salary;

		System.out.println(intSal);
		
		int age = 42;
		
		String strAge = Integer.toString(age);
		
		System.out.println(strAge);
		
		int intAge = Integer.valueOf(strAge);
		
		
		

		
	}

}
