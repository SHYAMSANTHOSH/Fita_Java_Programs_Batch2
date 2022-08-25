package com.fita.team2.exception;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int a = 10;
				int b = 0;
				System.out.println(a/b);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println("1st Try Block Completed");
			try{
				String name = null;
				System.out.println(name.charAt(1));
			}catch(Exception e1) {
				System.out.println(e1.getMessage());
			}
			System.out.println("2nd Try Block Completed");
			try {
				int[] a = {10,20};
				System.out.println(a[3]);
			}catch(Exception e3) {
				System.out.println(e3.getMessage());
			}
			System.out.println("3rd Try Block Completed");
		}finally {
			System.exit(0);
			System.out.println("Done");
		}
	}

}
