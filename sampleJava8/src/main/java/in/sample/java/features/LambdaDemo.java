package in.sample.java.features;

import java.util.Arrays;
import java.util.List;

interface Printable {
	void print(String name);
}

interface Fruits {
	int count(int numberOfApple, int numberOfMango);
}

public class LambdaDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		values.forEach(i -> System.out.println(i));

		// java 7

		Printable printable = new Printable() {

			@Override
			public void print(String name) {
				System.out.println(name);
			}
		};

		printable.print("java 7");

		// java 8
		Printable p = (name) -> System.out.println(name);
		p.print("java 8");

		Fruits f = (numberOfApple, numberOfMango) -> (numberOfApple + numberOfMango);
		System.out.println("count = " + f.count(20, 25));
	}

}
