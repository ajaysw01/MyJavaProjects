package com.aj.patterns;


import java.util.Scanner;

public class FirstDemo {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size ; i++){
            numbers[i] =sc.nextInt();
        }

        //output
        for(int i =0; i<size; i++){
            System.out.print(numbers[i]);
        }
     }
}