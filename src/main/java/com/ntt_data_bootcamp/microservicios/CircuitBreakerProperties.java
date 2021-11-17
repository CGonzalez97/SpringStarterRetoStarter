package com.ntt_data_bootcamp.microservicios;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cb")
public class CircuitBreakerProperties {
	
	private Integer counter = 0;

	public Integer getCounter() {
		return counter;
	}

	public void setCounter(Integer counter) {
		this.counter = counter;
	}

	

	

}
