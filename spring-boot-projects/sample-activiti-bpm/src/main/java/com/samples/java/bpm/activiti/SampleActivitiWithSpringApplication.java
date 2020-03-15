package com.samples.java.bpm.activiti;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * cgpradeepkumar 21-02-2019
 */

@Configuration
@SpringBootApplication(scanBasePackages = "in.sample.java.bpm")
public class SampleActivitiWithSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(SampleActivitiWithSpringApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<WebServlet> h2servletRegistration() {
		ServletRegistrationBean<WebServlet> registrationBean = new ServletRegistrationBean<>(new WebServlet());
		registrationBean.addUrlMappings("/console/*");
		return registrationBean;
	}
}
