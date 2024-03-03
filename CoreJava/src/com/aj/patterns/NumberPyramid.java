package com.aj.patterns;

public class NumberPyramid {
    public static void number(int n ){
        //lines
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j =1; j<n-i; j++){
                System.out.print(" ");

            }
            //numbers
            for(int j =1; j<=i; j++){
                System.out.print(i+" ");


            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        number(5);
    }
    
}
