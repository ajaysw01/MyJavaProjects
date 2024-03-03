package ExceptionHandling;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws Exception {
    Scanner  sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(Addtion.add(10, -5));
        
    }
    

    
}
class Addtion {
    static int add(int a , int b) throws Exception{
        if(a<0 || b<0){
            throw new Exception("Dont give neagativ eno");
        }else{
            return a+b;
        }
    }
}
