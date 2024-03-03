package com.aj.StringHandling;

public class Palindrome {
    public static void main(String[] args) {
        String s = "Vishal";
        String rev ="";
        for (int i = s.length()-1; i >=0; i--) {
            rev = rev+s.charAt(i);

        }
        if(s.equals(rev)) {
            System.out.println("String is a palindrome");
        }else {
            System.out.println("Not a palindrome");
        }

    }
}
