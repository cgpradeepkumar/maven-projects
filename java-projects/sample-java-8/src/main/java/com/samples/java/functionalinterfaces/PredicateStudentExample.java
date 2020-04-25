package com.samples.java.functionalinterfaces;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    private static Predicate<Student> p1 = student -> student.getGpa() < 4.0;
    private static Predicate<Student> p2 = student -> student.getGrade() < 2;

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAll();
        studentList.stream().filter(p1.and(p2)).forEach(s -> System.out.println(s));
    }
}
