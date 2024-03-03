package com.aj.questions;

import java.util.Scanner;

public class ReverseNumber3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        System.out.println(sb.reverse());
    }
}
