package com.harold.spring_project.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GamingConsole game;
	
	public GameRunner(@Qualifier("neoGeoGame") GamingConsole game) {
		this.game = game;
	}
	
	public void run() {
		game.check();
	}
}
