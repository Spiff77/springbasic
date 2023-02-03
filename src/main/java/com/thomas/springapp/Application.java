package com.thomas.springapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thomas.springapp.config.AppConfig;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBeanFactory().createBean(Entry.class).run(args);
	}
}
