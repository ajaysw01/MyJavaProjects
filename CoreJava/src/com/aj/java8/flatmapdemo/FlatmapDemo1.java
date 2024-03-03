package com.aj.java8.flatmapdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatmapDemo1 {
	public static void main(String[] args) {
		List<List<Integer>> numList = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,5),
				Arrays.asList(6,7)
				);
		
		//berfore stream if print the list
		/*
		for(List<Integer> lst:numList) {
			for(int num : lst) {
				System.out.println(num);
			}
		}
		*/
		
		//After stream
		List<Integer> numbers = numList.stream().flatMap(n-> n.stream().filter(num->num%2==0)).collect(Collectors.toList());
		System.out.println(numbers);
	
	}

}
