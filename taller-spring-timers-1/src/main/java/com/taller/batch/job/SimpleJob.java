package com.taller.batch.job;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.taller.batch.steps.Tarea1;
import com.taller.batch.steps.Tarea2;
import com.taller.batch.steps.Tarea3;

@Configuration
@EnableBatchProcessing
public class SimpleJob {

	@Autowired
	private StepBuilderFactory fabricanteStep;

	@Autowired
	private JobBuilderFactory fabricanteJob;

	public Step paso1() {
		return fabricanteStep.get("Paso1").tasklet(new Tarea1()).build();
	}

	public Step paso2() {
		return fabricanteStep.get("Paso2").tasklet(new Tarea2()).build();
	}

	public Step paso3() {
		return fabricanteStep.get("Paso3").tasklet(new Tarea3()).build();
	}

	@Bean
	Job simpleJobMetodo() {

		return fabricanteJob.get("ProcesarArchivoCrudo" + new Date().getTime()).start(paso1()).next(paso2())
				.next(paso3()).build();
	}

}
