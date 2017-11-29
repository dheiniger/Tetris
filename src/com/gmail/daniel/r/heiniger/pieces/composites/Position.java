package com.gmail.daniel.r.heiniger.pieces.composites;

import com.gmail.daniel.r.heiniger.engine.Engine;

public class Position {
	
	private int x;
	private int y;
	
	public Position(){
		this.x = 0;
		this.y = 0;
	}
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public static int getCenterX(){
		return Engine.BOARD_WIDTH/2;
	}
	
	public void shiftRight(){
		this.x++;
	}
	
	public void shiftLeft(){
		this.x--;
	}
	
	public void moveDown(){
		this.y++;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
}
