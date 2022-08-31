package com.fita.team2.thread;

public class ExtendsThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThread mul = new ExtendsThread();
		ExtendsThread mul1 = new ExtendsThread();
		mul.start();
		mul1.start();
	}
	
	public void run() {
		System.out.println("Running");
	}

}
