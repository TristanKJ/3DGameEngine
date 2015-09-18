package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {

	public Game()
	{
		
	}
	
	public void input()
	{
		if(Input.getKeyDown(Keyboard.KEY_UP))
			System.out.println("We pushed up");
		if(Input.getKeyUp(Keyboard.KEY_UP))
			System.out.println("we released up");
		
		if(Input.getMouseDown(1))
			System.out.println("Right clicked at " + Input.getMousePosition());
		if(Input.getMouseUp(1))
			System.out.println("Released Right click!");
	}
	
	public void update()
	{
		
	}
	
	public void render()
	{
		
	}
}
