package com.samples.java.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * imperative style - how style of programming
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum using imperative style = " + sum);

        /**
         * declarative style - what style of programming
         */
        int sum1 = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Sum using declarative style = " + sum1);
    }
}
