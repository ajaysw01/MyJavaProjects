package com.aj.java8.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
	public static void main(String[] args) {
		// Req : read element and multiply by 3 and store in new collection
		List<Integer> numList = Arrays.asList(2,3,5,6,7);
		
		List<Integer> result = new ArrayList<Integer>();
		
		//without using stream
//		for(int num : numList) {
//			//System.out.println(num*3);
//			result.add(num*3);
//		}
//		System.out.println(result);
		
		result =
		numList.stream().map(num -> num*3).collect(Collectors.toList());
		
		System.out.println(result);
		
	}
}
