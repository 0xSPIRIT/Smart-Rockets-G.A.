package com.thechief.smart;

import java.awt.Color;
import java.awt.Graphics;

import com.engine.main.Application;

public class Main extends Application {

	private static final long serialVersionUID = 1L;

	public static final int WIDTH = 900, HEIGHT = WIDTH / 16 * 9;
	public static final String TITLE = "Genetic Algorithm";
	
	public Main() {
		super(WIDTH, HEIGHT, TITLE);
	}

	@Override
	public void update() {
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
