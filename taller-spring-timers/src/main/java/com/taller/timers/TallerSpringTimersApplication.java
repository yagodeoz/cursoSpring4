package com.taller.timers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TallerSpringTimersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TallerSpringTimersApplication.class, args);
	}

}
