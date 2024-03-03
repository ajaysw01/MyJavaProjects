package Multithreading;

class A implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i< 5; i++){
            System.out.println(i);
        }
    }
    
}

public class Demo3 {
    public static void main(String[] args) {
        for(int i =0; i< 5; i++){
            A obj = new A();
        Thread myThread = new Thread(obj);
        myThread.start();
        myThread.isAlive();
        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
       
    }
    
}
