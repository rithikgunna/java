package com.rithik.learnspringframework;

import com.rithik.learnspringframework.game.GameRunner;
import com.rithik.learnspringframework.game.MarioGame;
import com.rithik.learnspringframework.game.PacManGame;
import com.rithik.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // var game = new MarioGame();//object creation
         //var game = new SuperContraGame();//object creation
         var game = new PacManGame();//object creation
         var gameRunner = new GameRunner(game);
         //object creation + wiring of dependencies
         //Game is a dependency of GameRunner class(dependency injection)
         gameRunner.run();
	}

}
