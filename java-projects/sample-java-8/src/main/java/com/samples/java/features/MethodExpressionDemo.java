package com.samples.java.features;

import java.util.function.Consumer;

public class MethodExpressionDemo {

	public static void main(String arg[]) {
		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Lamdba Expression");

		Consumer<String> c2 = System.out::println;
		c2.accept("Method Expression");
	}
}
