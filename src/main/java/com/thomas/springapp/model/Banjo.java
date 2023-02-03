package com.thomas.springapp.model;

import org.springframework.stereotype.Component;

@Component
public class Banjo implements Instrument{

	private String brand;
	
	public Banjo() {
	}

	public Banjo(String brand) {
		this.brand = brand;
	}

	public void play() {
		System.out.println(this.brand + ": Tigulingguiling");
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
		builder.append("Banjo [brand=").append(brand).append("]");
		return builder.toString();
	}
	
	

}
