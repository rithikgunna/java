 package com.rithik.learnspringframework.examples.a5;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.rithik.learnspringframework.examples.a5.SomeClass.SomeDependency;

import jakarta.annotation.PostConstruct;
@Component
class SomeClass{
	private SomeDependency someDependency;

	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println(" all dependencies are ready");
}
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("some logic");;
	}

	}
	
@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
	
	 
	public static void main(String[] args) {
		
	    try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
	    	
		}     
		
	}
}}