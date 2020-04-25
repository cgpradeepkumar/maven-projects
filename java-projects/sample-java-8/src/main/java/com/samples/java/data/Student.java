package com.samples.java.data;

import java.util.List;

public class Student {
    private String name;
    private String gender;
    private double gpa;
    private int grade;
    private List<String> activities;

    public Student(String name, String gender, double gpa, int grade, List<String> activities) {
        this.name = name;
        this.gender = gender;
        this.gpa = gpa;
        this.grade = grade;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", grade=" + grade +
                ", activities=" + activities +
                '}';
    }
}
