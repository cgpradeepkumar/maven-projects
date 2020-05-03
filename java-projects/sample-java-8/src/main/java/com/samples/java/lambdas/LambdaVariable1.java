package com.samples.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
    static int j = 0;
    public static void main(String[] args) {
        int i = 1;
        Consumer<Integer> c1 = integer -> {
//            i = 2; // variable used in lambda should be final or effectively final
//            int integer = 1; // cannot define same variable in same scope
            j = 1; // allowed
            System.out.println("integer = " + integer + ", j = " + j + ", i = " + i);
            integer = 1;
            System.out.println("integer = " + integer + ", j = " + j + ", i = " + i);
        };
        c1.accept(10);
    }
}
