package com.samples.java.streams;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {
        Map<String, List<String>> studentMap = StudentDatabase.getAll().stream()
                .filter(student -> student.getGrade() < 2)
                .collect(Collectors.toMap(Student::getName, Student::getActivities));
        System.out.println(studentMap);
    }
}
