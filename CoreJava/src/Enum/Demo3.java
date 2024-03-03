package Enum;
enum Status{
    Running, Failed, Pending, Success;
}

public class Demo3 {
    public static void main(String[] args) {
        
        Status s = Status.Pending;

        if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Failed)
            System.out.println("Try Again");
        else if(s==Status.Pending)
            System.out.println("Please Wait");
        else if(s ==Status.Success)
        System.out.println("done");
    }
}
