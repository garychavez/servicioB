package com.segundoservicio.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StudentsRest {
	
	@Bean("studentsMSRest")
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
}
