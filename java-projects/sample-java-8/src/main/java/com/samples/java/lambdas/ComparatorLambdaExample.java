package com.samples.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        // prior to java 8

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // if o1 > 02 = 1
                // if o1 == o2 = 0
                // if o1 < o2 = -1
                return o1.compareTo(o2);
            }
        };

        System.out.println("We get a 1, " + comparator.compare(6, 5));
        System.out.println("We get a 0, " + comparator.compare(6, 6));
        System.out.println("We get a -1, " + comparator.compare(6, 7));

        // using java 8

        Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);

        System.out.println("We get a 1, " + comparator2.compare(6, 5));
        System.out.println("We get a 0, " + comparator2.compare(6, 6));
        System.out.println("We get a -1, " + comparator2.compare(6, 7));

    }

}
