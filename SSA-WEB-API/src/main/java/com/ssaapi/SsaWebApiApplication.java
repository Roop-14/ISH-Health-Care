package com.ssaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SsaWebApiApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// Register your application class
		return builder.sources(SsaWebApiApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SsaWebApiApplication.class, args);
	}

}
