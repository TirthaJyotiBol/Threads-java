package com.tirtha.TryOut;

public class getSetThread {

    public static void main(String[]args){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("TirthaIsAThread");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);  // Main thread would be providing Exception
    }
}
