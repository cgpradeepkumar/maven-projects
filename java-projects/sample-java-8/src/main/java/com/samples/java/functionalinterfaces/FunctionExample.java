package com.samples.java.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");
    public static void main(String[] args) {
        System.out.println("Result = " + function.apply("Pradeep"));
        System.out.println("Result = " + function.andThen(addSomeString).apply("java 8 "));
        System.out.println("Result = " + function.compose(addSomeString).apply("java 8 "));
    }
}
