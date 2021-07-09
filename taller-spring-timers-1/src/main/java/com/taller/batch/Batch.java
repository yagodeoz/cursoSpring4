package com.taller.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.taller.batch.job.SimpleJob;

@SpringBootApplication
@Import(SimpleJob.class)
public class Batch {

	public static void main(String[] args) {
		SpringApplication.run(Batch.class, args);
	}

}
