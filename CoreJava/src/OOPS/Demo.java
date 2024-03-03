package OOPS;

class Parent{
    public void property(){
        Demo m1 = new Demo();;
        System.out.println("Given to child");
    }

}

class child extends Parent{



}


public class Demo{
    public static void main(String[] args) {
        class myself{
            public void speak(){
                System.out.println("hello");
            }
        }

        myself m = new myself();
        m.speak();


        Parent p = new child();
        p.property();
        
    }

}