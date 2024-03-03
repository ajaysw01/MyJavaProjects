package com.aj.questions;
import java.util.Scanner;

public class ReverseString1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scn.nextLine();

        StringBuffer sb = new StringBuffer(s);
        System.out.println(sb.reverse());
    }
}
