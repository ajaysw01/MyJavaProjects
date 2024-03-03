package aj.questions;

import java.util.Scanner;

public class ReverString2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = scn.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println(sb.reverse());
    }
}
