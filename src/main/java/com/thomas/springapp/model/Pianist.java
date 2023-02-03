package com.thomas.springapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pianist implements Musicien{

	private String name;
	
	@Autowired
	@Qualifier("piano")
	private Instrument instrument;
	
	public Pianist() {
	}

	public void playInstru() {
		System.out.println(this.name + " Joue d'un instrument:");
		this.instrument.play();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	

}
