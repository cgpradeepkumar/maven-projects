package com.samples.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
