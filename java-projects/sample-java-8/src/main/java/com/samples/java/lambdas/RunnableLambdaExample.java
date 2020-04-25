package com.samples.java.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        // prior to java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable 1.");
            }
        };
        new Thread(runnable).start();

        // java 8 way
        new Thread(() -> System.out.println("Runnable 2.")).start();
    }
}
