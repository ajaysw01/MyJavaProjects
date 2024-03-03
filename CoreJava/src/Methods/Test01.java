package Chapterwise.Methods;
//abstract method creation, implementation, calling and excuting

interface Shape{
    abstract void findArea();
}

class Rectangle implements Shape{
    double l;
    double b;

    public void findArea(){ //implementation
        System.out.println("Rectangle Area :"+(l*b));
    }
}
class Square implements Shape{
    double s;

    public void findArea(){
        System.out.println("Square Area :"+(s*s));

    }
}    
public class Test01 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.l=10;
        r1.b=20;
        r1.findArea();

        Square s1 = new Square();
        s1.s = 15;
        s1.findArea();

    }

    
}
