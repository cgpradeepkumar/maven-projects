package com.samples.java.functionalinterfaces;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a: " + a + ", b: " + b);
        biConsumer.accept("Pradeep", "Kumar");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication = " + a*b);
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division = " + a/b);

        multiply.andThen(division).accept(10, 5);

        List<Student> studentList = StudentDatabase.getAll();
        BiConsumer<String, List<String>> sConsumer = (name, activities) -> System.out.println("name = " + name + ", activities = " + activities);
        studentList.forEach(student -> sConsumer.accept(student.getName(), student.getActivities()));
    }
}
