package com.fita.team2.array;

import java.util.Arrays;

public class PassArrayToMethod {

	public static void main(String[] args) {
		
		double[] d = {10.5,20,30,20,10};
		printMethod(d);
	}

	static void printMethod(double[] value) {
		System.out.println(Arrays.toString(value));
	}
}
