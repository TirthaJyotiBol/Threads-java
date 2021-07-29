/*
                "IN the present case "
If the Thread scheduler accepts the yield then it will stop the main thread and run the "RUN METHOD"
if it is not accepted then main would be  executed first
 n/b output always vary depending on the scheduler
*/

package com.tirtha.TryOut;

public class yieldThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Created thread "+ i);
        }
    }
    public static void main(String[]args){
        yieldThread t = new yieldThread();
        t.start();
        Thread.yield();                   //Yield created for the main thread
        for(int i=0;i<5;i++){
            System.out.println(i +" Main Thread ");
        }
    }

}


