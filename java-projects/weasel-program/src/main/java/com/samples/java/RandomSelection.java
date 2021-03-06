package com.samples.java;

import java.util.Arrays;
import java.util.Random;

public class RandomSelection {

	public static void main(String[] args) {
		String target = "pradeep";
		char array[] = target.toCharArray();
		int count = 0;
		String now = "";
		while (!target.equals(now)) {
			char result[] = new char[array.length];
			System.out.println("number of attempt = " + count);
			count++;
			for (int i = 0; i < array.length; i++) {
				Random random = new Random();
				char c = (char) (random.nextInt(26) + 'a');
				if (array[i] == c) {
					result[i] = c;
				}
			}
			now = new String(result);
			System.out.println("current result = " + Arrays.toString(result));
		}
	}
}
