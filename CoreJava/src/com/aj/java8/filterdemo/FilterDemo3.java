package com.aj.java8.filterdemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo3 {
	public static void main(String[] args) {
		// names with length between 5 and 8
		List<String> names = Arrays.asList("Ajay","vijay","puja","govind","ak");
		
		List<String> longnames = 
				names.stream().filter(n-> n.length()>5 && n.length()<8).collect(Collectors.toList());
		
		System.out.print(longnames);
	}

}
