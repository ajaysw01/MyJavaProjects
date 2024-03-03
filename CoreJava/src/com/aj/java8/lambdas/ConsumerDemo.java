package com.aj.java8.lambdas;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String > c = s->System.out.print(s);
		c.accept("Hello");
	}

}
