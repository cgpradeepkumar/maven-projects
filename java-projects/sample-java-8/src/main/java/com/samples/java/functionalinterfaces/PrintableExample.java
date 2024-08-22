package com.samples.java.functionalinterfaces;

public class PrintableExample {

    public static void main(String[] args) {
        printSomething(new Printable() {
            @Override
            public void print() {
                System.out.println("This is an anonymous printable implementation!");
            }
        });

        printSomething(() -> System.out.println("This is a lambda printable implementation!"));
    }

    public static void printSomething(Printable printable) {
        printable.print();
    }
}
