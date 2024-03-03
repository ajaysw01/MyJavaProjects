package aj.questions;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "ajay";
		String rev ="";
		for(int i = str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("It is a palindrom");
		}else {
			System.out.println("Not a palindrome");
		}
	}
}
