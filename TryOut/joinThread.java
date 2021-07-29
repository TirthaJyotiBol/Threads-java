package com.tirtha.TryOut;

public class joinThread extends Thread{

    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Child Thread " + i);
        }
    }
    public static void main(String[]args)throws InterruptedException{
        joinThread t = new joinThread();
        t.start();
        t.join();
        for(int i=0;i<4;i++){
            System.out.println("Main thread "+ i);
        }
    }
}

/*
Same is done but only sleep method is used in between to exexute after a particular delay

    public void run(){
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread "+ i);
                thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main (String[]args)throws InterruptedException {
        joinThread t = new joinThread();
        t.start();
        t.join(1000);
        try{

            for(int i=0;i<5;i++){
                System.out.println("Main Thread "+ i);
                thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
*/