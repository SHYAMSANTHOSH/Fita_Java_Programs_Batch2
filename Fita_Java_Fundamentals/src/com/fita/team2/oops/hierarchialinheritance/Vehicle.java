package com.fita.team2.oops.hierarchialinheritance;

public class Vehicle {
	
	int tyre;
	String speedcontroller;
	int seatcapacity;
	
	public void displayAllPropries(){
		System.out.println(tyre + "-->" + speedcontroller + "<--" + seatcapacity);
	}
	
	public void VehicleMethod(int tyre,String speed,int seat){
		this.tyre = tyre;
		this.speedcontroller = speed;
		this.seatcapacity = seat;
	}

}
