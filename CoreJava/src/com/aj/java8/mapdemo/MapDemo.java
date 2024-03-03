package com.aj.java8.mapdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
		// converting list of city names to upper case and storign it into another collection
		List<String> city = Arrays.asList("pune","akola","mumbai","pimpri");
		
		//without using stream 
//		List<String> cityName = new ArrayList<String>();
		
		//enhanced for loop
		//ref var method madhech methdo
//		for(String value : city) {
//			cityName.add(value.toUpperCase());
//		}
//		System.out.println(cityName);
//		List<String> cityName =
//		city.stream().map(c -> c.toUpperCase()).collect(Collectors.toList());
//		System.out.println(cityName);
//		
		
		city.stream().map(c -> c.toUpperCase()).forEach(s -> System.out.print(s+" "));
	}

}
