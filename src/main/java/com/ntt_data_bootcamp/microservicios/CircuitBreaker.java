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
			this.setStatus("close");
			this.setCounter(counter++);
		}else {
			this.setStatus("open");
			this.setCounter(counter++);
		}
		return this.getStatus();
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Integer getCounter() {
		return counter;
	}



	public void setCounter(Integer counter) {
		this.counter = counter;
	}
	
	

}
