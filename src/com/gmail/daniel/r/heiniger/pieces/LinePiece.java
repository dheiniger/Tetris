package com.gmail.daniel.r.heiniger.pieces;

import java.awt.Color;
import java.awt.Graphics;

import com.gmail.daniel.r.heiniger.pieces.composites.Composite;
import com.gmail.daniel.r.heiniger.pieces.composites.Position;

public class LinePiece extends GamePiece{
	private static final long serialVersionUID = 1L;
	private static final Color COLOR = Color.YELLOW;
	
	public LinePiece(){
		super();
	
		for(int i = 0; i < getNumberOfComposites(); i++){
			this.pieceComposites[i] = new Composite(COLOR, determinePosition(i));
		}
	}
	
	private Position determinePosition(int index){
		return new Position(determineDefaultXCoordinate(), determineYCoordinate(index));
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		
		for (Composite composite : pieceComposites) {
			composite.paintComponent(g);
		}
	}
	
	
	
}
