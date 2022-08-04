package com.fita.team2.loop;

public class IfElseIfProgram {

	public static void main(String[] args) {
		
		String name = "Mani";
		int score = 76;
		if(score >=90) {
			System.out.println(name + " mark is Grade A");
		}else if((score >= 75) || (score <90)) {
			System.out.println(name + " mark is Grade B");
			
		}else if((score >=60) || (score <75)) {
			System.out.println(name + " mark is Grade C");
		}else if((score >=35) || (score <60)) {
			System.out.println(name + " mark is Grade D");
		}else {
			System.out.println(name + " mark is Fail");
		}
	}

}
