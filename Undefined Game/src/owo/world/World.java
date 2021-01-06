package owo.world;

import java.awt.Graphics;
import java.util.ArrayList;

import owo.object.Sprite;

public class World {

	public static World currentWorld = null;
	private static long lastTime = 0;
	public ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	
	public static void update ( ) {
		float deltaTime = (System.nanoTime() - lastTime) / 1000000000.0f;
		
		for (Sprite sprite : currentWorld.sprites) {
			sprite.update(deltaTime);
		}
	}
	
	public static void render (Graphics g) {
		for (Sprite sprite : currentWorld.sprites) {
			sprite.render(g);
		}		
	}
	
}
