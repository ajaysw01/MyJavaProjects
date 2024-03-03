package Multithreading;


class MT extends Thread{
    private int threadNumber;

    public MT(int threadNumber ){
        this.threadNumber = threadNumber;
    }



    public void run(){
        for(int i = 0; i<=5;i++){
            System.out.println(i + "from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            MT m = new MT(i);
            m.start();
        }
        
    }
    
}
