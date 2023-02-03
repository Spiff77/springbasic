package com.thomas.springapp.model;

import org.springframework.stereotype.Component;

@Component
public class Piano implements Instrument{

	private String brand;
	
	public Piano() {
	}

	public Piano(String brand) {
		this.brand = brand;
	}

	public void play() {
		System.out.println(this.brand + ": Bling bling bling");
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