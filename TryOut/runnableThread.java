package com.tirtha.TryOut;

class runnableThread implements Runnable
{
    public void run(){
        System.out.println("Thread task 2");
    }
    public static void main(String[]args){
        runnableThread th = new  runnableThread();
        Thread t = new Thread(th);
        t.start();

    }
}
