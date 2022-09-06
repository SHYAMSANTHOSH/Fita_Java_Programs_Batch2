package com.fita.team2.oops.hierarchialinheritance;

public class Bike extends Vehicle{
	
	int tyrenum = tyre;
	int seat = seatcapacity;
	String controller = speedcontroller;
	String modelname;
	
	Bike(int tyre,String conroller,int seat,String model){
		this.tyrenum = tyre;
		this.controller = conroller;
		this.seat = seat;
		this.modelname = model;
	}
	
	
	public void bikefunctionality() {
		System.out.println("Bajaj " + modelname + " has " + controller + " with " + seat + " capacity and " + tyrenum + " tyre based");
	}
	
	public static void main(String[] args) {
		
		Bike b = new Bike(2,"120 KMPH",3,"Pulsar");
		b.bikefunctionality();
		b.VehicleMethod(b.tyrenum, b.controller, b.seat);
		b.displayAllPropries();

	}

}
