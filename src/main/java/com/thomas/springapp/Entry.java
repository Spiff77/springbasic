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
		
		Musicien m1 = (Guitarist) context.getBean("guitarist");
		Musicien m2 = (Musicien) context.getBean("pianist");
		
		m1.playInstru();
		m2.playInstru();
		

		
	}
}