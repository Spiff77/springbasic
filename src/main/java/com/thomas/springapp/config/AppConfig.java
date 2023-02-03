package com.thomas.springapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import com.thomas.springapp.model.Banjo;
import com.thomas.springapp.model.Guitar;
import com.thomas.springapp.model.Guitarist;
import com.thomas.springapp.model.Instrument;
import com.thomas.springapp.model.Musicien;
import com.thomas.springapp.model.Piano;

@Configuration
@ImportResource("classpath:application-context.xml")
public class AppConfig {

	@Bean
	public Instrument gibson() {
		return new Guitar("Gibson");
	}
	
	@Bean
	public Instrument fender() {
		return new Guitar("Fender");
	}
	
	@Bean
	public Instrument yamaha() {
		Banjo b = new Banjo();
		b.setBrand("Yamaha");
		return b;
	}

	@Bean
	public Instrument pianeau() {
		return new Piano("Pianeau");
	}
	
	@Bean
	public Musicien hx() {
		Guitarist g = new Guitarist(this.yamaha());
		g.setName("Hendrix");
		g.setInstrument(fender());
		return g;
	}
	
	@Bean
	public Musicien ge() {
		Guitarist g = new Guitarist();
		g.setName("George");
		return g;
	}


}
