package in.sample.java.spring.rest.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = { "in.sample.java.spring.rest.data" })
@EnableJpaRepositories(basePackages = { "in.sample.java.spring.rest.data" })
public class ApplicationConfiguration {

}
