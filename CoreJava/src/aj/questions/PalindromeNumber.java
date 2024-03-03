package aj.questions;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int originalN = n;
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (originalN == rev) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
