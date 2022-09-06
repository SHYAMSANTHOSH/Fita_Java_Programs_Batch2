package com.fita.team2.oops.singleinheritance;

public class AdditionalDetails extends Employee{
	
	int bonus = 5000;
	public void bonusAmount(int salary) {
		
		int totalamt = salary+bonus;
		System.out.println("Total Amount Rs." + totalamt);
	}
	public static void main(String[] args) {
		
		AdditionalDetails add = new AdditionalDetails();
		System.out.println(add.empid);
		add.display();
		add.bonusAmount(add.salary);
	
	}

}
