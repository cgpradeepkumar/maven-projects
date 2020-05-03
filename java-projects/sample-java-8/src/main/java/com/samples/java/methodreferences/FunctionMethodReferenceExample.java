package com.samples.java.methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {
    static Function<String, String> lambda = s -> s.toUpperCase();
    static Function<String, String> methodRef = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(lambda.apply("Pradeep"));
        System.out.println(methodRef.apply("Pradeep"));
    }
}
