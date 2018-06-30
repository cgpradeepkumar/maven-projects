package in.sample.java.features;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeDemo {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalTime now = LocalTime.now();
		System.out.println(now);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		Instant instant = Instant.now();
		System.out.println(instant);
	}

}
