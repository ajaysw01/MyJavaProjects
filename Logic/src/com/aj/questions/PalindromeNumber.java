package com.aj.questions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        int rev =0;
        boolean flag = false;
        //12345
        while(num!=0){
            rev = rev * 10 + num%10;
            num = num/10;
        }

        if(rev == num){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
