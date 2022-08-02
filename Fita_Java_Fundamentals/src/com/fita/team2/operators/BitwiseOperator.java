package com.fita.team2.operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		
		int num = 100;
		int num1 = 90;
		
		int sum = 190;
		
		if((num == 100) || (num1>90)){
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		String name = "Shyam";
		int tamil = 90;
		int english = 67;
		int maths = 40;
		int science = 80;
		int social = 98;
		
		if((tamil >= 35) && (english >= 35) && (maths >= 35) && (science >= 35) && (social  >=35)) {
			System.out.println("Pass");
			System.out.print("Total Marks of " + name + " = ");
			System.out.print(tamil + english + maths + science + social);
		}else {
			System.out.println("Fail");
			System.out.print("Total Marks of " + name + " = ");
			System.out.print(tamil + english + maths + science + social);
		}
		
		System.out.println(num);
		
		System.out.println("Exclusive OR operation : ");
		
		int a = 10;
		int b = 12;
		System.out.println(a^b);
		

	}

}
