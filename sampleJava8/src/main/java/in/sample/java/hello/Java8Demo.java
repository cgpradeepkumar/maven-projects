package in.sample.java.hello;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo {

	public static void main(String arg[]) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		System.out.println("List : " + strings);

		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("empty strings = " + count);

		count = strings.stream().filter(string -> (string.length() == 3)).count();
		System.out.println("string of length 3 = " + count);

		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("filtered list = " + filtered);

		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String = " + mergedString);
	}
}
