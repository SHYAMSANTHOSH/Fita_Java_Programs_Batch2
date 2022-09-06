package com.fita.team2.oops.hierarchialinheritance;

public class Car extends Vehicle {
	
	int tyrenum;
	int seat;
	String controller;
	String modelname;
	
	Car(int tyre,String conroller,int seat,String model){
		this.tyrenum = tyre;
		this.controller = conroller;
		this.seat = seat;
		this.modelname = model;
	}
	
	public void carfunctionality() {
		System.out.println("Maruti  " + modelname + " has " + controller + " with " + seat + " capacity and " + tyrenum + " tyre based");
	}

	public static void main(String[] args) {
		Car c = new Car(4,"180 KMPH",5,"Desire");
		c.carfunctionality();
		c.VehicleMethod(c.tyrenum, c.controller, c.seat);
		c.displayAllPropries();

	}

}
