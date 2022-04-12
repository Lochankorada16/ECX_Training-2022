package com.training;

import com.training.model.HealthInsurance;
import com.training.model.Insurance;
import com.training.model.LifeInsurance;
import com.training.model.VehicleInsurance;

public class Application {

	public static void printPremium(Insurance object) {
	
		System.out.println("Premium:="+object.calculatePremium());
	}
	
	public static void main(String[] args) {
		
		VehicleInsurance car = new VehicleInsurance(1010,"Lochan",2010, "car",2019);
		
		printPremium(car);
		
		LifeInsurance life = new LifeInsurance(1010, "Lochan", 60);
		
		printPremium(life);
		
		//System.out.println(car.calculatePremium());
		
		//System.out.println(car.getPolicyHolderName());
		
		String[] illness = {"ent", "thyroid"};
		
		HealthInsurance health = new HealthInsurance(3030, "Lokesh",illness);
		
		printPremium(health);
	}

}
