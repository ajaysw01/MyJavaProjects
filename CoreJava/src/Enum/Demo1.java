package Enum;

enum Status{

    // it is treated as a class. below are the objects
    //It starts with 0
    //have to use ordinal method

    Running, Failed, Pending, Success;
}

public class Demo1{
    public static void main(String[] args) {
        
        int i = 5;
        Status s = Status.Failed;
        System.out.println(s);

        System.out.println(s.ordinal());

        
    }
}