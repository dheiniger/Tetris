package com.gmail.daniel.r.heiniger.pieces;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.gmail.daniel.r.heiniger.engine.Engine;
import com.gmail.daniel.r.heiniger.pieces.composites.Composite;

public abstract class GamePiece extends JPanel{
	private static int NUMBER_OF_COMPOSITES = 4;
	protected Composite pieceComposites[];
	
	public GamePiece(){
		pieceComposites = new Composite[NUMBER_OF_COMPOSITES];
	}
	
	protected int getNumberOfComposites(){
		return NUMBER_OF_COMPOSITES;
	}
	
	protected int determineDefaultXCoordinate(){
		return getCenterOfBoard() - Composite.WIDTH;
	}
	
	protected int determineYCoordinate(int index){
		return index * Composite.HEIGHT;
	}
	
	private int getCenterOfBoard(){
		return Engine.SCALE * Engine.BOARD_WIDTH/2;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	   
	   
}
