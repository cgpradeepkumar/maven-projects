package com.samples.java.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
    static Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
    public static void main(String[] args) {
        System.out.println("Result = " + binaryOperator.apply(7, 9));
        System.out.println("minBy = " + BinaryOperator.minBy(comparator).apply(8, 9));
        System.out.println("maxBy = " + BinaryOperator.maxBy(comparator).apply(8, 9));
    }
}
