package com.aj.streams;

import java.util.Arrays;
import java.util.List;

public class ToArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("a","b","c","2","3","1");
		Object[] array = list.stream().toArray();
		for(Object v : array) {
			System.out.println(v);
		}

	}

}
