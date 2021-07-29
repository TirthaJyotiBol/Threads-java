//Thread created using thread class

package com.tirtha.TryOut;

 class thread extends Thread {
     @Override
    public void run()
    {
       System.out.println("thread task");
    }
    public static void main(String[]args){
        thread t = new thread();
         t.start();
    }
}
