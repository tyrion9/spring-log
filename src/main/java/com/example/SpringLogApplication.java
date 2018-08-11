package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLogApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringLogApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLogApplication.class, args);

		log.info("Ngon {}: {}", "hay that", 200000l);
		
		if (log.isDebugEnabled())
			log.debug("Hay day");
	}
}
