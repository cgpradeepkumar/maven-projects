package com.samples.java.hello;

public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int limit = 5;
        int temp;

        System.out.println(a);
        System.out.println(b);
        for (int i = 3; i <= limit; i++) {
            temp = a+b;
            a = b;
            b = temp;
            System.out.println(temp);
        }
    }
}
