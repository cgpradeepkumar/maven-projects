package com.samples.java.constructorreference;

import com.samples.java.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {
    static Supplier<Student> studentSupplier = Student::new;
    static Function<String, Student> function = name -> {
        Student student = studentSupplier.get();
        student.setName(name);
        return student;
    };
    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(function.apply("Pradeep"));
    }
}
