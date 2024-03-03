package com.aj.multithreadingdemo;

public class Demo extends Thread{
    public synchronized void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("Thread Running..."+Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        Demo demo1 = new Demo();
        Demo demo2= new Demo();
        Demo demo3= new Demo();
        Demo demo4= new Demo();

        demo.setName("Ajju");
        demo2.setDaemon(true);
        demo2.setName("Bhai");
        demo3.setName("Jai Shri Ram");
        demo4.setName("Bodyguard");

        demo.start();
        demo2.start();
        demo3.start();
        demo4.start();

    }
}
