package com.aj.questions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scn.nextLine();
        //ABCDE
        String rev ="";
        for (int i = s.length()-1; i >=0; i--) {
         rev = rev + s.charAt(i);
        }
        System.out.println("Reverse String "+rev);
    }
}