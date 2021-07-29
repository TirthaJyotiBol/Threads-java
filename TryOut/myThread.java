package com.tirtha.TryOut;

public class myThread extends  Thread {
    @Override
    public void run(){
        System.out.println("This is provided by : "+Thread.currentThread().getName());
    }

    public static void main (String[] args)
    {
        System.out.println("This is provided by :"+Thread.currentThread().getName());
        myThread th = new myThread();
        th.start();     //This is Thread 0 in main Thread

        myThread t1 = new myThread();
        t1.start();   //This is Thread 1 in main Thread


    }
}
