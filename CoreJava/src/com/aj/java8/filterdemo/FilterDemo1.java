package com.aj.java8.filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
	public static void main(String[] args) {
//	ArrayList<Integer> numList = new ArrayList<Integer>();
//		numList.add(10);
//		numList.add(20);
//		numList.add(30);
		//Instead of adding one by one we can use asList 
		List <Integer> numList = Arrays.asList(10,15,20,25,30);
		
		List<Integer> evenNum = new ArrayList<Integer>();
		
		//without using stream
		for(int n :numList) {
			if(n%2==0) {
				evenNum.add(n);
			}
		}//for
		System.out.println(evenNum);
				
	}

}
