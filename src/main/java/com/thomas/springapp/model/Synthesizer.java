package com.thomas.springapp.model;

import org.springframework.stereotype.Component;

@Component
public class Synthesizer implements Instrument{

	private String brand;
	
	public Synthesizer() {
	}

	public Synthesizer(String brand) {
		this.brand = brand;
	}

	public void play() {
		System.out.println(this.brand + ": zuiiihzhuii");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piano [brand=").append(brand).append("]");
		return builder.toString();
	}

}