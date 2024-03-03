package OOPS;

abstract class Animal {
    int age;
    int name;

    public abstract void makeNosie();
}

class Cat extends Animal {
    public void makeNosie() {
        System.out.println("meow");
    }
}


interface Species{

    // int age;
    // int name;  // these are static and final we have to initialize and are available to efvery subclasses
    public boolean fly();
}

class Dog implements Species{

    @Override
    public boolean fly() {
        return false;
    }

}
public class AbstractDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeNosie();

        Dog d = new Dog();
        System.out.println( d.fly());
    }

}
