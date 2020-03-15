package com.samples.java.rest.api;

import org.h2.server.web.WebServlet;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan
@EnableJpaRepositories
public class ApplicationConfiguration {

	@Bean
	ServletRegistrationBean h2serServletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new WebServlet());
		servletRegistrationBean.addUrlMappings("/console/*");
		return servletRegistrationBean;
	}

}
