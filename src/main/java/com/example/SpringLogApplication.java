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
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i < 1000; i++){ 
					log.info("Testing...");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
