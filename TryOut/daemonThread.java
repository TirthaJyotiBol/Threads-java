package com.tirtha.TryOut;

public class daemonThread extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("daemon ");
        }
        else
        System.out.println("Run thread");
    }
    public static void main(String[]args){
        System.out.println("Main Thread");
        daemonThread t =new daemonThread();
        t.setDaemon(true);
        t.start();

    }
}
