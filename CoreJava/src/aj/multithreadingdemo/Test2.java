package aj.multithreadingdemo;


//1. implemenst runnable
public class Test2 extends RverseNumber implements  Runnable  {
    String name;
    public  Test2() {
        this.name = name;
    }

    //2. override run method
    @Override
    public void run() {
        System.out.println(name+"running"+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        //3. create Test class object
        Test2 t1 = new Test2();
        //4. create Thread class object
        //5. pass test class reference as paramters
        Thread th = new Thread(t1);
//        th.setPriority(10);
        //6.calling start method
        th.start();
//        Thread p = Thread.currentThread();
//        System.out.println(p);

        RverseNumber rv = new RverseNumber();
        Thread t2 = new Thread(rv);
//        t2.setPriority(4);
        t2.start();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(th.getName()+":"+th.getPriority());
        System.out.println(t2.getPriority());

    }
}
