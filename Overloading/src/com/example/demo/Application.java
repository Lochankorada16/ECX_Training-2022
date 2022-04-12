package com.example.demo;
import java.util.*;
/**
 * @author KoradaLochanDurga.S
 *
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name");
		
		String name = sc.next();
		
		System.out.println("Enter the Farenheit Temp:");
		
		double farenTemp = sc.nextDouble();
		
		System.out.println("Enter the amount");
		
		double amt = sc.nextDouble();
		
		System.out.println("Enter the Current to Convert 1-USD 2-EURO");
		
		int frm = sc.nextInt();
		
		Converter conv = new Converter();
		
		System.out.println(conv.convert(name));
		
		System.out.println("Celcius Temp:="+conv.convertTemp(farenTemp));
		
		System.out.println(conv.convert(amt, frm));
		
		sc.close();
	}

}
