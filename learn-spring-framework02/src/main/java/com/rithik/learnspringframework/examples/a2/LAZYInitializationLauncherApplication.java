 package com.rithik.learnspringframework.examples.a2;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
class ClassA{
	
}
@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("initilization logic");
		this.classA=classA;
	}
	public void doSomething() {
		System.out.println("something something");
	}
}
@Configuration
@ComponentScan
public class LAZYInitializationLauncherApplication {
	
	 
	public static void main(String[] args) {
		
	    try (var context = new AnnotationConfigApplicationContext(LAZYInitializationLauncherApplication.class)) {
	    	System.out.println("initilization logic");
	    	context.getBean(ClassB.class).doSomething();
	    	//System.out.println(context.getBean(ClassB.class).doSomething());
		} 
		
	}

}
