package com.tirtha.TryOut;

                               //Either throw Exception

public class sleepM1 {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println("Hello World");
            Thread.sleep(8000);
        }

    }
}



                                 //OR USE TRY CATCH

/*
public class sleepM1 {
    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            try {
                System.out.println("Using Try Catch for Sleep");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Error : " + e);
            }

        }
    }


}
*/