package com.omnicient;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Demo1 {
	public static void main(String[] args) {
		String str = "Wankhade";

		
		int org_length = str.length();
		
		String s2 =str.replaceAll("a", "");
		
		int len = s2.length();
		
		int occurance = org_length - len;
		
		System.out.println(occurance);
		char[] chars = str.toCharArray();
		
		
		
		
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char ch : chars) {
		
		}
		
		
		
//		char[] chars = str.toCharArray();
//		Arrays.sort(chars);//aadkhnw
//		int count = 1;
//		char ch = 'a';
//		
//		
//		//
//		
//		for(int i = 0; i<chars.length-1; i++) {
//			if('c' == chars[i+1] ){
//				count++;
//				break;
//			}
//			System.out.println(chars[i] +""+count );
//
//		}
		
		
	}

}
