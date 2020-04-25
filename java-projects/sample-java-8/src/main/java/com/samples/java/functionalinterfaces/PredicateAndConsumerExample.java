package com.samples.java.functionalinterfaces;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    private Predicate<Student> p1 = student -> student.getGrade() < 2;
    private Predicate<Student> p2 = student -> student.getGpa() < 4.0;
    private BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade < 2 && gpa < 4.0;
    private BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println("name = " + name + ", activities = " + activities);
    private Consumer<Student> consumer = student -> {
        if (p1.and(p2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }

        // using bi predicate
        if(biPredicate.test(student.getGrade(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    private void printNameAndActivities() {
        List<Student> studentList = StudentDatabase.getAll();
        studentList.forEach(consumer);
    }

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printNameAndActivities();
    }
}
