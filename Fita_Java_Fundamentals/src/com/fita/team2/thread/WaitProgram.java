package com.fita.team2.thread;

public class WaitProgram implements Runnable{
	    
	    private Message msg;
	    
	    public WaitProgram(Message m){
	        this.msg=m;
	    }

	    @Override
	    public void run() {
	        String name = Thread.currentThread().getName();
	        synchronized (msg) {
	            try{
	                System.out.println(name+" waiting to get notified at time:"+System.currentTimeMillis());
	                msg.wait(); // Important
	            }catch(InterruptedException e){
	                e.printStackTrace();
	            }
	            System.out.println(name+" waiter thread got notified at time:"+System.currentTimeMillis());
	            //process the message now
	            System.out.println(name+" processed: "+msg.getMsg());
	        }
	    }

	}