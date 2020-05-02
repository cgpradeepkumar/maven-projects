package com.samples.java.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    // input and output are of same type
    static UnaryOperator<String> unaryOperator = s -> s.concat("default");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("pradeep"));
    }
}
