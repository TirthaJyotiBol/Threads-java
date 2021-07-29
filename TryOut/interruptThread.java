package com.tirtha.TryOut;

public class interruptThread extends Thread{
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(i);
                thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Thread interrupted "+e);
        }
    }
        public static void main(String[]args){
            interruptThread t = new interruptThread();
            t.start();
            t.interrupt();
        }

}
