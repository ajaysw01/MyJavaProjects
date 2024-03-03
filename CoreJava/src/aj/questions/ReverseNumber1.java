package aj.questions;

import java.util.Scanner;

public class ReverseNumber1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        System.out.println(sb.reverse());
    }
}
