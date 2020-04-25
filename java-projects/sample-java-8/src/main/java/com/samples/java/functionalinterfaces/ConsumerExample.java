package com.samples.java.functionalinterfaces;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> c1 = s -> System.out.println(s.toUpperCase());
        c1.accept("java8");

        Consumer<Student> c2 = s -> System.out.println(s);
        Consumer<Student> c3 = s -> System.out.println(s.getName());
        Consumer<Student> c4 = student -> System.out.println(student.getActivities());
        List<Student> list = StudentDatabase.getAll();
        System.out.println("----- all the students -----");
        list.forEach(c2);
        System.out.println("----- students and their activities -----");
        list.forEach(c3.andThen(c4)); // consumer chaining.
        // conditional
        System.out.println("----- students with less grade -----");
        list.forEach(student -> {
            if(student.getGpa() < 4.0) {
                c3.andThen(c4).accept(student);
            }
        });
    }
}
