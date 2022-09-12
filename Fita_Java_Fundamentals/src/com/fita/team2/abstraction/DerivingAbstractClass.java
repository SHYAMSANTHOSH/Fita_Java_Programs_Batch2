package com.fita.team2.abstraction;

public class DerivingAbstractClass extends AbstractClass{
	
	
	public void carmoving() {
		
		System.out.println("Car Moving with help of cletcch + break + Acceslerator");
		
	}

	public static void main(String[] args) {
	
		DerivingAbstractClass der = new DerivingAbstractClass();
		der.carmoving();
		der.cardisplay();

	}

	

}
