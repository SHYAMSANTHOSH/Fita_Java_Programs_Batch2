package com.fita.team2.constructor;

public class ParameterizedConstructor {

	int value;
	String name;
	public static void main(String[] args) {
		ParameterizedConstructor param = new ParameterizedConstructor();
		ParameterizedConstructor param1 = new ParameterizedConstructor(30,"Shyam");
		ParameterizedConstructor param2 = new ParameterizedConstructor(30,"Shyam","Kumar");
		param1.display();
	}
	
	ParameterizedConstructor(){
		System.out.println("Welcome");
	}
	
	ParameterizedConstructor(int num,String value){
		this.value = num;
		this.name = value;
		System.out.println(num + "--> " + value);
	}
	ParameterizedConstructor(int num1,String fname,String Lname){
		System.out.println(num1 + "-> " + fname + "<--" + Lname);
	}
	
	public void display(){
		System.out.println(value);
		System.out.println(name);
	}

}
