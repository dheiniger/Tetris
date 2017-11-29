package com.gmail.daniel.r.heiniger.pieces.composites;

import com.gmail.daniel.r.heiniger.engine.Engine;
/**
 * A {@link PositionTest} represents the x and y coordinates of
 * 1 {@link Composite}. The {@code x - coordinate} of a {@link PositionTest} is equal
 * to the {@code width} of one {@link Composite}.  Similarly, the {@code y - coordinate} 
 * is equal to the {@code height} of one {@link Composite}
 * @author Daniel
 *
 */
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
	
	private Position(Position p){
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public static int getCenterX(){
		return Engine.BOARD_WIDTH/2;
	}
	
	public static Position getPositionRightOf(Position p){
		return new Position(p).shiftRight();
	}
	
	public static Position getPositionLeftOf(Position p){
		return new Position(p).shiftLeft();
	}
	
	public static Position getPositionBelow(Position p){
		return new Position(p).shiftDown();
	}
	
	public static Position getPositionAbove(Position p){
		return new Position(p).shiftUp();
	}
	
	public static int getShiftXAmount(){
		return Composite.WIDTH;
	}
	
	public static int getShiftYAmount(){
		return Composite.HEIGHT;
	}
	
	public Position shiftRight(){
		this.x+= Composite.WIDTH;
		return this;
	}
	
	public Position shiftLeft(){
		this.x-= Composite.WIDTH;
		return this;
	}
	
	public Position shiftDown(){
		this.y+= Composite.HEIGHT;
		return this;
	}
	
	public Position shiftUp(){
		this.y-= Composite.HEIGHT;
		return this;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
}
