package com.aj.patterns;

public class FloydTraingle {
    public static void triangle(int n ){
        int c = 1;
        for(int i = 1; i<= n; i++){
            // counter track
            for(int j =1; j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        triangle(5);
        
    }
    
}
