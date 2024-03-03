package Multithreading;

class ThreadWork extends Thread{
    @Override
    public void run(){
        for(int i = 0; i<5;i++){
            System.out.println(i);
           try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        ThreadWork tw = new ThreadWork();
        ThreadWork tw2 = new ThreadWork();
        tw.start();
        tw.start();
        
    }
    
}
