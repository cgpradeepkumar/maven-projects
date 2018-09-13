package in.sample.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
