package com.fita.team2.array;

public class MultiDimensionArray {

	public static void main(String[] args) {
		String [][] city = {{"Tamil Nadu","Kerala"},{"Coimbatore","Cochin","Nellore","Madurai"},{"Chennai","Erode"}};
//		System.out.println(city[0][0]);
//		System.out.println(city[1][0]);
//		System.out.println(city[2][0]);
		for(int i=0;i<city.length;i++) {
			for(int j=0;j<city[i].length;j++) {
				System.out.println(city[i][j]);
			}
		}
	}

}
