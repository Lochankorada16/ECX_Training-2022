package com.training;

import com.training.model.BankAccount;
import com.training.model.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		BankAccount account = new BankAccount(1010, "Ramesh", 50000, "savings");
//		
//		System.out.println(account);
		
	BankAccount ramsAccount = new BankAccount(123, "Lochan", 2000, "savings");	
		
	SavingsAccount account = new SavingsAccount(650, "Ramesh", 1000, "joint", "Rajesh");
	
	System.out.println(account.getAccountHolderName());
	
	System.out.println(account.getNominee());
	
	//super class is equal to subclass acceptable
	
	SavingsAccountService service = new SavingsAccountService();
	
	System.out.println(service.getCustomerInfo(account));
	
	System.out.println(service.calculateInterest(account));
	
	BankAccountService service2 = new SavingsAccountService();
	
	//cannot access the subclass method with superclass reference;
	//service2.getCustomerInfo(account);
	
	SavingsAccountService savingService2 = (SavingsAccountService)service2;
	
	//subclass is equal to super class ivalid
	
	//SavingsAccountService sc2 = new BankAccountService();
	
	BankAccountService sc2 = new SavingsAccountService();
	
	SavingsAccountService savingService3 = (SavingsAccountService)sc2;
	
	System.out.println(savingService3.getCustomerInfo(account));
	
	}

}
