package com.fita.team2.thread;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Message msg = new Message("process it");
        WaitProgram waiter = new WaitProgram(msg);
        new Thread(waiter,"waiter").start();
        
        WaitProgram waiter1 = new WaitProgram(msg);
        new Thread(waiter1, "waiter1").start();
        
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");
    }

}
