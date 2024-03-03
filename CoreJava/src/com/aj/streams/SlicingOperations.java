package com.aj.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SlicingOperations {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vehicleList = Arrays.asList("bus","car","bike","car","bus","trains");
		
		List<String>  collect = vehicleList.stream().distinct().collect(Collectors.toList());

		System.out.println(collect);
		
		vehicleList.stream().distinct().forEach(System.out::println);
		
		long count = vehicleList.stream().count();
		System.out.println(count);
		
		vehicleList.stream().limit(2).forEach(System.out::println);
	}

}
