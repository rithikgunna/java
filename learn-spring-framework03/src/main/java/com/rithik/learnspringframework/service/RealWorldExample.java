package com.rithik.learnspringframework.service;


import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldExample {
	
	public static void main(String[] args) {
		
	    try (var context = new AnnotationConfigApplicationContext(RealWorldExample.class)) {
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		} 
		
	}

}
