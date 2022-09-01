package com.fita.team2.oops;


class Parent{
	public void display() {
		System.out.println("Parent class Calling");
	}
}
public class RuntimePolymorphism extends Parent{
	
	
	public void display() {
		super.display();
		System.out.println("Child class Calling");
	}

	public static void main(String[] args) {
		RuntimePolymorphism p = new RuntimePolymorphism();
		p.display();

	}

}
