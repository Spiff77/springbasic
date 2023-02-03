package com.thomas.springapp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Guitarist implements Musicien{

	private String name;
	
	@Autowired
	@Qualifier("banjo")
	private Instrument instrument;
	
	public Guitarist() {
	}

	public void doSlam() {
		System.out.println("Youhouuu");
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
