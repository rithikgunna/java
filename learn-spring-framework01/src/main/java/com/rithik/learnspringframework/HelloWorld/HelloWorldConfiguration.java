package com.rithik.learnspringframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address (String street, String city) {};

@Configuration
public class HelloWorldConfiguration {
    @Bean  
	public String name() {
	  return "Rithik";
  }
    @Bean  
	public int age() {
	  return 15;
  }
    @Bean  
   	public Person Person() {
   	  return new Person("Ravi", 20, new  Address("4179 meadowland ct", "Chantilly, Va")); 
    }
   	@Bean  
   	public Person Person2MethodCall () {
   	  return new Person(name(), age(), address());
     }
	@Bean  
   	public Person Person3Parameters (String name, int age, Address address) {
   	  return new Person(name, age, address);
     }
    @Bean  
   	public  Address  address() {
   	  return  new  Address("4179 meadowland ct", "Chantilly, Va"); 
    }
}
