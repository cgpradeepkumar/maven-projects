package in.sample.java.hello;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Demo {

	public static void main(String arg[]) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);
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

		System.out.println("numbers = " + numbers);
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("Squared List = " + squaresList);

		System.out.println("Integers = " + integers);
		IntSummaryStatistics stats = integers.stream().mapToInt(x -> x).summaryStatistics();

		System.out.println("Highest number in the list = " + stats.getMax());
		System.out.println("Lowest number in the list = " + stats.getMin());
		System.out.println("Count = " + stats.getCount());
		System.out.println("Sum = " + stats.getSum());
		System.out.println("Average = " + stats.getAverage());
	}
}
