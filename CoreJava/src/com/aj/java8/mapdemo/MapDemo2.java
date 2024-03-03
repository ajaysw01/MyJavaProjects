package com.aj.java8.mapdemo;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
	public static void main(String[] args) {
		
		//
		List<String> vehicles = Arrays.asList("bus","car","bike","cycle","flight");
		//without stream
//		for(String name : vehicles) {
//			System.out.println(name.length());
//			
//		}
		
		//using map 
		
	vehicles.stream().map(name -> name.length()).forEach(len -> System.out.println(len));
	
	vehicles.stream().map(name -> name.length()).forEach(System.out::println);	}

}