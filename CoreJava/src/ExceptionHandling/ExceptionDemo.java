package ExceptionHandling;

public class ExceptionDemo {
public static void main(String[] args) {
        try {
        int a = 100/0;
        System.out.println(a);

    }catch(ArithmeticException e ){
        e.printStackTrace();
    }finally{
        System.out.println("hello ajay");
    }
    
}


    
    
}
