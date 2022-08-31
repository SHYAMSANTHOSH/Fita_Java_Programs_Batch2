package com.fita.team2.thread;

public class ImplementThread implements Runnable {
	private static Object obj = new Object();
	public void run() {
		try {
			Thread.sleep(5*1000);
			synchronized (obj)    
	        {  
			 obj.wait();
			 System.out.println("---- " );
	        }
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Running"  );
	}
	public static void main(String[] args) throws Exception {
		ImplementThread im = new ImplementThread();
		Thread t1 = new Thread(im); // New State
		Thread t2 = new Thread(im);
		Thread t3 = new Thread(im);
		Thread t4 = new Thread(im);
		
		t1.start(); // Active State
		//t2.wait();
		t2.start();
		t3.start();
		 
	}
}
