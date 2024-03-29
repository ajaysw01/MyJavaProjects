package com.aj.java8.filterdemo;

import java.util.ArrayList;
import java.util.List;

class Product{
	int price;
	String name;
	
	Product(int price, String name){
		this.name = name;
		this.price = price;
	}
}

public class FilterDemo4 {
	public static void main(String[] args) {
	
		List<Product> product =new ArrayList<Product>();
		
		product.add(new Product(199,"book"));
		product.add(new Product(299,"cup"));
		product.add(new Product(10,"pen"));
		product.add(new Product(50,"watch"));
	
		//product.stream().filter(p -> p.price > 100).collect(Collectors.toList());
		
		product.stream().filter(p -> p.price >100).forEach(p -> System.out.println(p.name));
	
	}

}
