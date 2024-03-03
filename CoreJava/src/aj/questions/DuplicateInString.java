package aj.questions;

import java.util.Arrays;

public class DuplicateInString {
	public static void main(String[] args) {
		String str = "LEETCODE";
		
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		String sortedString = new String(chars);
		
		for(int i =0; i<sortedString.length(); i++) {
			int count = 1;
			while(i < sortedString.length() && sortedString.charAt(i)==sortedString.charAt(i+1)) {
				count++;
				i++;
			}
			if(count>1) {
				System.out.println(sortedString.charAt(i) + " "+ count);
			}
		}
	}

}
