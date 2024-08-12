package com.harold.spring_project.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {
	
	@Bean
	public GamingConsole marioGame() {
		var game = new MarioGame();
		return game;
	}
	
	@Bean
	@Qualifier("neoGeo")
	public GamingConsole neoGeoGame() {
		var game = new NeoGeo();
		return game;
	}
	
	@Bean
	public GameRunner marioRunner() { 
		var gameRunner = new GameRunner(marioGame());
		return gameRunner;
	}
	
	@Bean
	public GameRunner neoGeoRunner(@Qualifier("neoGeo") GamingConsole neoGeoGame) { 
		var gameRunner = new GameRunner(neoGeoGame);
		return gameRunner;
	}
	
	
	
}
