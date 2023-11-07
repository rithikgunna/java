package com.rithik.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rithik.learnspringframework.game.GameRunner;
import com.rithik.learnspringframework.game.GamingConsole;
import com.rithik.learnspringframework.game.PacManGame;
@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
}
