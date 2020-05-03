package com.samples.java.methodreferences;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1 = student -> System.out.println(student);
    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDatabase.getAll().forEach(c1);
        StudentDatabase.getAll().forEach(c2);
        StudentDatabase.getAll().forEach(c3);
    }
}
