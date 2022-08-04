package com.fita.team2.loop;

public class NestedIfProgram {

	public static void main(String[] args) {
		
		String vehicle = "Car";
		String Model = "Amaze";
		String Color = "Black";
		
		if(vehicle.equalsIgnoreCase("car")) {
			if(Model.equals("Swift")) {
				System.out.println("You Choosed " + Model + " car with " + Color + " Color");
			}else if(Model.equals("Venue")) {
				System.out.println("You Choosed " + Model + " car with " + Color + " Color");
			}else {
				System.out.println("No Model Choosed");
			}
		}
		

	}

}
