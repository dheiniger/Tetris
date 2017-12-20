package com.gmail.daniel.r.heiniger.tetrominoes;

import java.awt.Graphics;

import javax.swing.JPanel;

import com.gmail.daniel.r.heiniger.tetrominoes.composites.Composite;

public abstract class Tetromino extends JPanel{
	private static final long serialVersionUID = 1L;
	private static int NUMBER_OF_COMPOSITES = 4;
	
	protected Composite pieceComposites[];
	
	public Tetromino(){
		pieceComposites = new Composite[NUMBER_OF_COMPOSITES];
	}
	
	public Composite[] getComposites(){
		return this.pieceComposites;
	}
	
	protected int getNumberOfComposites(){
		return NUMBER_OF_COMPOSITES;
	}

	public void shiftLeft(){
		for (Composite composite : pieceComposites) {
			composite.getRelativePosition().shiftLeft();
		}
	}
	
	public void shiftRight(){
		for (Composite composite : pieceComposites) {
			composite.getRelativePosition().shiftRight();
		}
	}
	
	public void shiftUp(){
		for (Composite composite : pieceComposites) {
			composite.getRelativePosition().shiftUp();
		}
	}
	
	public void shiftDown(){
		for (Composite composite : pieceComposites) {
			composite.getRelativePosition().shiftDown();
		}
	}
	
	public void rotateRight(){
		for (Composite composite : pieceComposites) {
			composite.getRelativePosition().rotateRight();
		}
	}
	
	public void rotateLeft(){
	
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for (Composite composite : pieceComposites) {
			composite.paintComponent(g);
		}
	}	
}
