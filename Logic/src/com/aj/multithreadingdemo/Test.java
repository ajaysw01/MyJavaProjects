package com.aj.multithreadingdemo;



//1. extending thread class
public class Test extends Thread{
    //2. Overriding run()
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside run");

        }

    }

    public static void main(String[] args) throws InterruptedException {
        //3. Creatin object of Test Class
        Test t = new Test();
        //4.calling start()
        //non runnable state : sleep(), interrupt(0, wait(),suspend

        t.start();
    }
}
