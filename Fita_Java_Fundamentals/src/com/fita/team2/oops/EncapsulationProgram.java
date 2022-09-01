package com.fita.team2.oops;

public class EncapsulationProgram {
	int vehicleno;
	String model;
	String carname;
	
	EncapsulationProgram(int vehicleno,String model,String name){
		this.vehicleno = vehicleno;
		this.model = model;
		this.carname = name;
	}
	
	private int getVehicleno() {
		return vehicleno;
	}


	private void setVehicleno(int vehicleno) {
		this.vehicleno = vehicleno;
	}


	private String getModel() {
		return model;
	}


	private void setModel(String model) {
		this.model = model;
	}


	private String getCarname() {
		return carname;
	}


	private void setCarname(String carname) {
		this.carname = carname;
	}


	public static void main(String[] args) {
		EncapsulationProgram en = new EncapsulationProgram(9676,"Amaze","Honda");
		System.out.println(en.carname  + "---> " + en.model + "<---- " + en.vehicleno);
		en.setCarname("Hyundai");
		System.out.println(en.getCarname());
		System.out.println(en.carname);
	}

}
