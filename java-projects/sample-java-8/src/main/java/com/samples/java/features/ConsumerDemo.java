package com.samples.java.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {

	/*
	 * Write a program to print odd, even and numbers greater than 5 using Consumer
	 * functional Interface in addition to Predicate interface.
	 * 
	 * Hint: Method accept(T t) to be used to print the numbers.
	 */

	public static void main(String arg[]) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Consumer<Integer> c = i -> System.out.println(i);
		Predicate<Integer> p = i -> i > 5;

		numbers.stream().filter(p).forEach(t -> c.accept(t));
	}
}
