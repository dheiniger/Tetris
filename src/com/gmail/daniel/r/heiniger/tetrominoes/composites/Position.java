package com.gmail.daniel.r.heiniger.tetrominoes.composites;

import com.gmail.daniel.r.heiniger.engine.Engine;
/**
 * A {@link Position} represents the x and y coordinates of
 * 1 {@link Composite}. The {@code x - coordinate} of a {@link Position} is equal
 * to the {@code width} of one {@link Composite}.  Similarly, the {@code y - coordinate} 
 * is equal to the {@code height} of one {@link Composite}
 * @author Daniel
 *
 */
public class Position {
	private static int BUFFER_SPACE = 1;
	//TODO make private instead?
	protected int x;
	protected int y;
	
	public Position(){
		this.x = 0;
		this.y = 0;
	}
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Position(Position p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public static int getCenterXCoordinate(){
		return Engine.BOARD_WIDTH/2 - BUFFER_SPACE;
	}
	
	public static int getDrawingCenterXCoordinate(){
		return getCenterXCoordinate() - getShiftXAmount();
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
		return Composite.WIDTH + BUFFER_SPACE;
	}
	
	public static int getShiftYAmount(){
		return Composite.HEIGHT + BUFFER_SPACE;
	}
	
	public Position shiftRight(){
		this.x+= getShiftXAmount();
		return this;
	}
	
	public Position shiftLeft(){
		this.x-= getShiftXAmount();
		return this;
	}
	
	public Position shiftDown(){
		this.y+= getShiftYAmount();
		return this;
	}
	
	public Position shiftUp(){
		this.y-= getShiftYAmount();
		return this;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public boolean isOccupied(){
		//TODO
		return false;
	}
	
	@Override
	public boolean equals(Object o){
		Position comparedPosition = (Position)o;
		return this.x == comparedPosition.getX()
				&& this.y == comparedPosition.getY();
	}
	
	@Override
	public String toString(){
		return "X: " + this.x + " Y: " + this.y;
	}
}
