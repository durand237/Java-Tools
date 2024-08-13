package com.harold.spring_project;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harold.spring_project.game.GameRunner;
import com.harold.spring_project.game.GamingConfig;
import com.harold.spring_project.game.MarioGame;
import com.harold.spring_project.game.NeoGeo;
import com.harold.spring_project.hello_spring.HelloSpringConfig;

public class AppGamingBasic {

	public static void main(String[] args) {
		
		/**
		 * run the game with nornam java virtual marchine
		var marioGame = new MarioGame();
		var neoGeo = new NeoGeo();
		var gameRunner = new GameRunner(marioGame);
		var neoGeoRunner = new GameRunner(neoGeo);
		neoGeoRunner.run();
		gameRunner.run();
		*/

		//run the  games with spring iOC
		try(var context =  new AnnotationConfigApplicationContext(GamingConfig.class)) {
			
			//System.out.println(context.getBean());
			var mario = context.getBean("marioRunner", GameRunner.class);
			var neoGeo = context.getBean("neoGeoRunner", GameRunner.class);
			
			neoGeo.run();
			mario.run();
		}
	}

}
