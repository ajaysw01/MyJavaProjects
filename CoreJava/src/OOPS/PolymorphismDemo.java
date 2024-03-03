package OOPS;
class Computer{

}

class Laptop extends Computer{

}

class A{
    public void show(){
        System.out.println("in a show");
    }
}

class B extends A{

    public void show(){
        System.out.println("in B show");
    }

}


public class PolymorphismDemo {

    public static void main(String[] args) {

        A obj = new B();
        obj.show();

        obj = new B();

        Computer obj1 = new Laptop();
    }
}