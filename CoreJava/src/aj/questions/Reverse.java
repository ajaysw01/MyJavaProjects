package aj.questions;

public class Reverse {
	public static void main(String[] args) {
		String s ="ABCD";
		System.out.println("Originsl String:"+s);
		String rev ="";
		for(int i= s.length()-1;i>=0;i--) {
			rev = rev +s.charAt(i);
		}
		System.out.println("Original String: "+rev);
				
		String str ="ABCDEF";
		System.out.println("\nOriginal String: "+str);
		String reverse ="";
		char[] c = str.toCharArray();
		for(int i = c.length-1; i>=0; i--) {
			reverse = reverse + c[i];
		}
		System.out.println("Reversed String: "+reverse);
	}
}
