package com.thomas.springapp.model;

public class Pianist implements Musicien{

	private String name;
	
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
