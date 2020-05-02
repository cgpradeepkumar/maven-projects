package com.samples.java.functionalinterfaces;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
          return new Student("Arun", "M", 4.1, 3, Arrays.asList("driving", "cricket"));
        };

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAll();

        System.out.println("supplier = " + studentSupplier.get());
        System.out.println("list supplier = " + listSupplier.get());
    }
}
