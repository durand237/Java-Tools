package com.harold.spring_project.game;

public class NeoGeo implements GamingConsole {

	@Override
	public void up() {
		System.out.println("up");
		
	}

	@Override
	public void down() {
		System.out.println("down");
		
	}

	@Override
	public void left() {
		System.out.println("left");
		
	}

	@Override
	public void right() {
		System.out.println("right");
		
	}

	@Override
	public void check() {
		System.out.println("hey i am NeoGeo");
		
	}

}
