package in.sample.java.features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SupplierDemo {

	/*
	 * Tim has his own Sandwich corner where he sells different types of sandwich
	 * which includes
	 * 
	 * Cheese Sandwich
	 * 
	 * Corn sandwich
	 * 
	 * Mix Veg sandwich
	 * 
	 * Write a program to add the above to a collection using Consumer interface and
	 * print all using Supplier interface. Use only lambda functions.
	 *
	 */
	public static void main(String[] args) {

		List<String> sandwichList = new ArrayList<>();
		Consumer<List<String>> consumer = (list) -> {
			list.add("Cheese Sandwich");
			list.add("Corn sandwich");
			list.add("Mix Veg sandwich");
			list.add("Tuna Fish sandwich");
		};

		consumer.accept(sandwichList);

		// how to use supplier for print here? :-(
		sandwichList.forEach(System.out::println);
	}

}
