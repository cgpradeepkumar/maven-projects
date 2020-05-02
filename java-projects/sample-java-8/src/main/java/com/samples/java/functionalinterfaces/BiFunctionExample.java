package com.samples.java.functionalinterfaces;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> studentFunction = ((students, studentPredicate) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {
            if (studentPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDatabase.getAll(), student -> student.getGpa() > 3.8));
    }
}
