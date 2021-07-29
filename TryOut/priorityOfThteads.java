package com.tirtha.TryOut;

public class priorityOfThteads extends  Thread {
    public void run(){
        System.out.println("Child Thread");
    }

    public static void main(String[]args){
        System.out.println("Main class default priority  :"+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(8);  // setting up the priority

        System.out.println("Main class after priority is set :"+ Thread.currentThread().getPriority());//getting after priority is set

        priorityOfThteads t = new priorityOfThteads();
        t.start();
        System.out.println("child thread : "+Thread.currentThread().getPriority()); //Child

    }
}
