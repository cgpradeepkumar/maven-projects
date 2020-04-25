package com.samples.java.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    private static Predicate<Integer> p1 = i -> i % 2 == 0;
    private static Predicate<Integer> p2 = i -> i % 5 == 0;

    private static void predicateAnd() {
        System.out.println(p1.and(p2).test(10));
        System.out.println(p1.and(p2).test(8));
    }

    private static void predicateOr() {
        System.out.println(p1.or(p2).test(10));
        System.out.println(p1.or(p2).test(8));
    }

    public static void main(String[] args) {
        // is given number even?
        Predicate<Integer> p = i -> i % 2 == 0;
//        System.out.println(p.test(10));

        predicateAnd();
        predicateOr();
    }
}
