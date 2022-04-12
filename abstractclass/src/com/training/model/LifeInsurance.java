package com.training.model;

public class LifeInsurance extends Insurance {

	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LifeInsurance(int policyNumber, String policyHolderName, int age) {
		super(policyNumber, policyHolderName);
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium;
		if(age<50){
			premium = 2000;
		}
		else {
			premium = 10000;
		}
		return premium;
	}

}
