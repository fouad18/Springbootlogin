package com.optum.EHRLabIntegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-security-config.xml") 
@PropertySource("classpath:application.properties")
public class EhrLabIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(EhrLabIntegrationApplication.class, args);
	}
}
