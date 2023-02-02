package com.thomas.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thomas.springapp.model.Guitarist;
import com.thomas.springapp.model.Instrument;
import com.thomas.springapp.model.Musicien;
import com.thomas.springapp.model.Pianist;
import com.thomas.springapp.model.Piano;

public class Entry {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		
		Musicien m1 = (Guitarist) context.getBean("hx");
		Musicien m2 = (Pianist) context.getBean("mz");
		Musicien m3 = (Pianist) context.getBean("sh");
		
		Instrument p = context.getBean(Instrument.class);
		
		m1.playInstru();
		m2.playInstru();
		m3.playInstru();
		
		p.play();
	}
}