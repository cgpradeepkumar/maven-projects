package com.samples.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jonas");
        names.add("hannah");
        names.add("ulrich");
        names.add("martha");
        names.add("katharina");
        names.add("Ines");
        names.add("Mikkel");

        names.remove(5);
        System.out.println(names);

        Stream<String> nameStream = names.stream();
//        nameStream.add not available
//        nameStream.remove not available
        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println); a stream can be traversed only once
    }
}
