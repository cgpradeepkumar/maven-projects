package com.samples.java.streams;

import com.samples.java.data.StudentDatabase;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamsMapExample {
    public static void main(String[] args) {
        List<String> names = StudentDatabase.getAll().stream().map(student -> student.getName()).collect(toList());
        System.out.println(names);
    }
}
