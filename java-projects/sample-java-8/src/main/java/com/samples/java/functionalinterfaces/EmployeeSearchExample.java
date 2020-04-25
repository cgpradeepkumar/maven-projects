package com.samples.java.functionalinterfaces;

import com.samples.java.data.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class EmployeeSearchExample {

    private BiPredicate<String, Employee> firstname = (text, employee) -> employee.getFirstname().startsWith(text);
    private BiPredicate<String, Employee> lastname = (text, employee) -> employee.getLastname().startsWith(text);
    private BiPredicate<String, Employee> email = (text, employee) -> employee.getEmail().startsWith(text);

    public static void main(String[] args) {
        EmployeeSearchExample example = new EmployeeSearchExample();
        example.search("p").forEach(System.out:: println);
    }

    private List<Employee> search(String text) {
        return getAll()
                .parallelStream()
                .filter(employee -> firstname.or(lastname).or(email).test(text, employee))
                .collect(Collectors.toList());
    }

    private List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Pradeep", "Kumar", "pradeep-kumar@sample.com"));
        employees.add(new Employee("Anand", "Kumar", "anand-kumar@sample.com"));
        employees.add(new Employee("Abhishek", "Kumar", "abhishek-kumar@sample.com"));
        employees.add(new Employee("Vikram", "Kumar", "vikram-kumar@sample.com"));
        employees.add(new Employee("Varun", "Kumar", "varun-kumar@sample.com"));
        employees.add(new Employee("Arun", "Kumar", "arun-kumar@sample.com"));
        employees.add(new Employee("Arun", "Lal", "arun-lal@sample.com"));
        employees.add(new Employee("George", "Kurian", "george-kurian@sample.com"));
        employees.add(new Employee("Anu", "Thomas", "anu-thomas@sample.com"));
        employees.add(new Employee("Laila", "Majnu", "laila-majnu@sample.com"));
        employees.add(new Employee("Rohit", "Sankar", "rohit-sankar@sample.com"));
        employees.add(new Employee("Philip", "John", "philip-john@sample.com"));
        employees.add(new Employee("Paul", "Scaria", "paul-scaria@sample.com"));
        employees.add(new Employee("Surya", "Ravi", "surya-ravi@sample.com"));
        employees.add(new Employee("Shias", "Koya", "shias-koya@sample.com"));
        employees.add(new Employee("Dennis", "Mathew", "dennis-mathew@sample.com"));
        employees.add(new Employee("Mathew", "Philip", "mathew-philip@sample.com"));
        return employees;
    }
}
