package com.taller.timers.proceso;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TareAutomatica {

	@Scheduled(fixedDelayString = "5000")
	public void procesarTabla () {
		
		System.out.println("Procesando Tabla");
		
	}
	
}
