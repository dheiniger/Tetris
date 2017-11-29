package com.gmail.daniel.r.heiniger.pieces;

import java.awt.Color;

import com.gmail.daniel.r.heiniger.pieces.composites.Composite;
import com.gmail.daniel.r.heiniger.pieces.composites.Position;

public class SquarePiece extends GamePiece{
	private static final long serialVersionUID = 1L;
	private static final Color COLOR = Color.CYAN;
	
	public SquarePiece(){
		super();
		this.pieceComposites[0] = new Composite(COLOR, new Position(Position.getCenterX(), 0));
		this.pieceComposites[1] = new Composite(COLOR, new Position(Position.getCenterX(), 1));
		this.pieceComposites[2] = new Composite(COLOR, new Position(Position.getCenterX() + 50, 0));
		this.pieceComposites[3] = new Composite(COLOR, new Position(Position.getCenterX() + 50, 1));
	}
}
