package com.samples.java.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class WordReversal {
    public static void main(String[] args) {
        String word = "Dog bites man";
        String words[] = word.split(" ");
        String reverse = Arrays.stream(words).sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);
    }
}
