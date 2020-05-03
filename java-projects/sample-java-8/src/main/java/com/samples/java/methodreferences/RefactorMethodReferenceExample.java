package com.samples.java.methodreferences;

import com.samples.java.data.Student;
import com.samples.java.data.StudentDatabase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> gradeAboveThree = RefactorMethodReferenceExample::isGradeAboveThree;

    public static boolean isGradeAboveThree(Student student) {
        return student.getGrade() >= 3;
    }
    public static void main(String[] args) {
        System.out.println(gradeAboveThree.test(StudentDatabase.studentSupplier.get()));
    }
}
