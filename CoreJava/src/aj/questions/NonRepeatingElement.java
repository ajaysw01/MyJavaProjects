package aj.questions;

import java.util.HashSet;
import java.util.Map;

public class NonRepeatingElement {
	public static void main(String[] args) {
		String str = "SAQSQPAT";
		
		for (int i = 0; i < str.length(); i++) {
			boolean flag = true;

			for (int j = 0; j < str.length(); j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					flag = false;
					break;
				}
				
				
				if(flag==true) {
					System.out.println(str.charAt(i));
					break;
				}

			}
						
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = 0; i<str.length()-1;i++) {
//			for(int j =0; j<str.length()-1;j++) {
//				if( i!=j && str.charAt(i)==str.charAt(j)) {					
//				}else {
//					System.out.println(str.charAt(j));
//				}
//				
//			}
//		}
		
	}

}
