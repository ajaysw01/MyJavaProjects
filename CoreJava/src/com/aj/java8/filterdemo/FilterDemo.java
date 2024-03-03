package com.aj.java8.filterdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo {
	public static void main(String[] args) {
		//with using stream
		List<Integer> numList = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNumList =new ArrayList<Integer>();
		
		
		//with stream
		
		evenNumList =
				numList.stream().filter(n-> n%2==0).collect(Collectors.toList());
		
		//to print directly
		numList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));//consumer le
	}

}
