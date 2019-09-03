package in.sample.java.bpm.activiti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * cgpradeepkumar 21-02-2019
 */

@SpringBootApplication(scanBasePackages = "in.sample.java.bpm")
public class SampleActivitiWithSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleActivitiWithSpringApplication.class, args);
	}
}
