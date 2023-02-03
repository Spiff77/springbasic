package com.thomas.springapp.model;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{

	private String brand;
	
	public Guitar() {
	}

	public Guitar(String brand) {
		this.brand = brand;
	}

	public void play() {
		System.out.println(this.brand + ": Cling Cling Cling");
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
		builder.append("Guitar [brand=").append(brand).append("]");
		return builder.toString();
	}
	
	

}
