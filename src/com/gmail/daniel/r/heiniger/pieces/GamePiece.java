package com.gmail.daniel.r.heiniger.pieces;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.gmail.daniel.r.heiniger.pieces.composites.Composite;

public abstract class GamePiece extends JPanel{
	private static final long serialVersionUID = 1L;
	private static int NUMBER_OF_COMPOSITES = 4;
	
	protected Composite pieceComposites[];
	
	public GamePiece(){
		pieceComposites = new Composite[NUMBER_OF_COMPOSITES];
	}
	
	protected Composite[] getComposites(){
		return this.pieceComposites;
	}
	
	protected int getNumberOfComposites(){
		return NUMBER_OF_COMPOSITES;
	}

	public void shiftLeft(){
		for (Composite composite : pieceComposites) {
			composite.getPosition().shiftLeft();
		}
	}
	
	public void shiftRight(){
		for (Composite composite : pieceComposites) {
			composite.getPosition().shiftRight();
		}
	}
	
	public void shiftUp(){
		for (Composite composite : pieceComposites) {
			composite.getPosition().shiftUp();
		}
	}
	
	public void shiftDown(){
		for (Composite composite : pieceComposites) {
			composite.getPosition().shiftDown();
		}
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for (Composite composite : pieceComposites) {
			composite.paintComponent(g);
		}
	}	
}
