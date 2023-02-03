package com.thomas.springapp.model;

import org.springframework.stereotype.Component;

@Component
public class Guitarist implements Musicien{

	private String name;
	
	private Instrument instrument;
	
	public Guitarist() {
	}
	

	public Guitarist(Instrument instrument) {
		super();
		this.instrument = instrument;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Guitarist [name=");
		builder.append(name);
		builder.append(", instrument=");
		builder.append(instrument);
		return builder.toString();
	}
	
	
	
	

}
