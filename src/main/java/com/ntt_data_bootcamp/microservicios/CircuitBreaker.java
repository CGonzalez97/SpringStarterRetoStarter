package com.ntt_data_bootcamp.microservicios;

public class CircuitBreaker {
	
	private String status = "open";
	private Integer counter = 0;

	
	
	public CircuitBreaker(String status, Integer counter) {
		super();
		this.status = status;
		this.counter = counter;
	}



	public String tryToChangeStatus() {
		if(this.counter > 3) {
			this.status = "close";
		}else {
			this.status = "open";
		}
		return this.status;
	}

}
