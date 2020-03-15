package com.samples.java.spring.rest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "in.sample.java.spring.rest")
public class SampleSpringApp {

	public static void main(String args[]) {
		SpringApplication.run(SampleSpringApp.class, args);
	}

}
