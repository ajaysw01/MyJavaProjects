package aj.questions;

public class ReverseNo {
	public static void main(String[] args) {
		int a =1234;
		int rev =0;
		while(a !=0) {
			rev= rev *10+ a%10;
			a = a/10;
		}
		System.out.println(rev);
		
		
		
		int num = 123456;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
	}
}
