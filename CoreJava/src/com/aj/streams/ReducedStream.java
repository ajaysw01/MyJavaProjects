package com.aj.streams;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("a","b","c","2","3","1");
		
		Optional<String> reduced =
		list.stream().reduce((x,y)->{
			return y+x;
		});

		System.out.println(reduced.get());
	}

}