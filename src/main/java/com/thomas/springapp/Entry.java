package com.thomas.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thomas.springapp.config.AppConfig;
import com.thomas.springapp.model.Instrument;

public class Entry {
	
	@Autowired
	@Qualifier("gibson")
	Instrument instrument;
	
	public void run(String[] args) {		
		System.out.println("Bienvenue blabla");
	}
}