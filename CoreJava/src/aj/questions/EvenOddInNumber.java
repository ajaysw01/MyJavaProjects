package com.aj.questions;

import java.util.Scanner;

public class EvenOddInNumber {
    public static void main(String[] args) {
        int num = 123456;
           int even_count=0;
           int odd_count = 0;
           while(num>0){
               if (num % 2 != 0) {
                   odd_count++;
               } else {
                   even_count++;
               }
           }
        System.out.println("No of even digits :"+ even_count);
        System.out.println("No of odd digits : "+odd_count);
    }

}

