package com.samples.java.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 2, 4, 6, 7, 1, 8, 8, 9);

        /**
         * Imperative approach
         */
        List<Integer> result = new ArrayList<>();
        for (int i : list) {
            if (!result.contains(i))
                result.add(i);
        }
        System.out.println("result using imperative approach = " + result);
        /**
         * declarative approach
         */

        List<Integer> result1 = list.stream().distinct().collect(Collectors.toList());
        System.out.println("result using declarative approach = " + result1);

    }
}
