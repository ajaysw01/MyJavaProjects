package aj.questions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scn.nextInt();
        int revNum =0;
        while(num!=0){
            revNum = revNum * 10 +num%10;//extracting last digit
            num = num/10;//remove last digit
        }
        System.out.println("Reverse Number : "+revNum);

    }

}
