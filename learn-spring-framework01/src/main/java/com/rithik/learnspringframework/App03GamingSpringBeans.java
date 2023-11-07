package com.rithik.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rithik.learnspringframework.game.GameRunner;
import com.rithik.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
	    try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} 
		
	}

}
