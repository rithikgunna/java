package com.rithik.learnspringframework.HelloWorld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		try (//1:Launch a spring context
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			//3:Retrieving beans managed by spring
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("Person"));
			
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean("Person2MethodCall"));
			System.out.println(context.getBean("Person3Parameters"));
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
