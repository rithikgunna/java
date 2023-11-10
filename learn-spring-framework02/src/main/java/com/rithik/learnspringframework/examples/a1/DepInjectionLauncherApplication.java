 package com.rithik.learnspringframework.examples.a1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
class yourBusinessClass{
	
	Dependecy1 dependecy1;
	Dependecy2 dependecy2;
	@Autowired	
public yourBusinessClass(Dependecy1 dependecy1, Dependecy2 dependecy2) {
		super();
		System.out.println("construction DI");
		this.dependecy1 = dependecy1;
		this.dependecy2 = dependecy2;
	}

//	@Autowired
//	public void setDependecy1(Dependecy1 dependecy1) {
//		System.out.println("setter di1");
//		this.dependecy1 = dependecy1;
//	}
//	@Autowired
//	public void setDependecy2(Dependecy2 dependecy2) {
//		System.out.println("setter di1");
//		this.dependecy2 = dependecy2;
//	}

	public String toString() {
		return "using" + dependecy1 + "and" +  dependecy2;
	}
}
@Component
class Dependecy1{
	
}
@Component
class Dependecy2{
	
}
@Configuration
@ComponentScan("com.rithik.learnspringframework.examples.a1")
public class DepInjectionLauncherApplication {
	
	 
	public static void main(String[] args) {
		
	    try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class)) {
	    	
			System.out.println(context.getBean(yourBusinessClass.class));
		} 
		
	}

}
 